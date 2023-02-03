package cn.fmm.java_learn.design_pattern.state_pattern.project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @author liang
 * @time 2022/11/14
 * @desc 状态机定义
 */
public class StateMachine {

    protected Map<String, IState> stateMap = new HashMap<>();
//    protected Set<IStateUpdater> updaterSet = new HashSet<>();
    protected IState currentState = null;

    public StateMachine() {
    }

    // PUBLIC METHODS

    /**
     * 设置初始化状态
     */
    public void setInitialState(IState state) {
        this.currentState = state;
    }

    /**
     * 添加事件类型与状态映射
     */
    public void addState(String eventType, IState state) {
        addState(eventType, null, state);
    }

    /**
     * 添加事件类型、事件子类型与状态映射
     */
    public void addState(String eventType, String eventSubType, IState state) {
        String eventId = formatEventId(eventType, eventSubType);
        stateMap.put(eventId, state);
    }

    /**
     * 添加状态变更监听
     * 需要与 removeUpdater(IStateUpdater) 成对使用，否则会出现内存泄漏
     */
//    public void addUpdater(IStateUpdater updater) {
//        if (updater != null) {
//            updaterSet.add(updater);
//        }
//    }

    /**
     * 移除状态变更监听
     */
//    public void removeUpdater(IStateUpdater updater) {
//        if (updater != null) {
//            updaterSet.remove(updater);
//        }
//    }

    /**
     * 发送事件推进状态变更
     * @param event 自定义事件
     * @return true 成功切换状态，false 状态切换失败，currentState 仍保持原值
     */
    public boolean post(Event event) {
        String eventId = formatEventId(event.getType(), event.getSubType());
        IState toState = stateMap.get(eventId);

        IState fromState = this.currentState;
        boolean result = toState.valid(fromState, event);
        if (!result) {
            return false;
        }
        fromState.exit();
        toState.enter(fromState, event);
        this.currentState = toState;
//        SLogUtil.info("[StateMachine] 执行事件 %s-%s，状态更新为 %s",
//                event.getType(), event.getSubType(), currentState.getStateId());

//        Set<IStateUpdater> updaters = new HashSet<>(updaterSet);
//        for (IStateUpdater updater : updaters) {
//            updater.onUpdate(fromState, toState);
//        }

        return true;
    }

    /**
     * 获取当前状态
     */
    public IState getCurrentState() {
        return currentState;
    }


    // PROTECTED METHODS

    protected String formatEventId(String eventType, String eventSubType) {
        if (eventSubType == null) {
            eventSubType = "";
        }
        return eventType + "::" + eventSubType;
    }

}

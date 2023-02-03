package cn.fmm.java_learn.design_pattern.state_pattern.project;


/**
 * @author kdd
 * @time 2022/11/14
 * @desc 连麦初始化状态（未连麦）
 */
public class AudioTalkInitialState implements IState {

    // OVERRIDE METHODS FOR `IState`

    @Override
    public String getStateId() {
        return StateName.INITIAL;
    }

    @Override
    public boolean valid(IState fromState, Event event) {
        return true;
    }

    @Override
    public void enter(IState fromState, Event event) {

    }

    @Override
    public void exit() {
    }

    @Override
    public String toString() {
        return "AudioTalkInitialState{" +
                "stateId=" + getStateId() +
                '}';
    }

}

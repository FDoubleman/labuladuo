package cn.fmm.java_learn.design_pattern.state_pattern.project;


/**
 * @author kdd
 * @time 2022/11/14
 * @desc 连麦中状态
 */
public class AudioTalkRunningState implements IState {


    /**
     * 是否正在展示白板
     */
//    public boolean isDisplayWhiteboard() {
//        return WhiteboardManager.getInstance().isDisplayed();
//    }


    // OVERRIDE METHODS FOR `IState`

    @Override
    public String getStateId() {
        return StateName.RUNNING;
    }

    @Override
    public boolean valid(IState fromState, Event event) {
        return true;
    }

    @Override
    public void enter(IState fromState, Event event) {

//        if (TextUtils.equals(event.getSubType(), EventType.INSTRUCT_SUB_EVENT_ON_MICROPHONE)) {
//            turnOnMicrophone(event);
//        } else if (TextUtils.equals(event.getSubType(), EventType.INSTRUCT_SUB_EVENT_OFF_MICROPHONE)) {
//            turnOffMicrophone(event);
//        } else if (TextUtils.equals(event.getSubType(), EventType.INSTRUCT_SUB_EVENT_OPEN_WHITEBOARD)) {
//            openWhiteboard(event);
//        } else if (TextUtils.equals(event.getSubType(), EventType.INSTRUCT_SUB_EVENT_CLOSE_WHITEBOARD)) {
//            closeWhiteboard(event);
//        }
    }

    @Override
    public void exit() {
    }


    @Override
    public String toString() {
        return "AudioTalkRunningState{" +
                "stateId=" + getStateId() +
                '}';
    }

}

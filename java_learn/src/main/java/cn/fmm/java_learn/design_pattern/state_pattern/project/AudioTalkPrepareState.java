package cn.fmm.java_learn.design_pattern.state_pattern.project;


import sun.audio.AudioPlayer;

/**
 * @author kdd
 * @time 2022/11/14
 * @desc 连麦准备状态（展示导学提醒弹窗等视图）
 */
public class AudioTalkPrepareState implements IState {

    // OVERRIDE METHODS FOR `IState`

    @Override
    public String getStateId() {
        return StateName.PREPARE;
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
        return "AudioTalkPrepareState{" +
                "stateId=" + getStateId() +
                '}';
    }

}

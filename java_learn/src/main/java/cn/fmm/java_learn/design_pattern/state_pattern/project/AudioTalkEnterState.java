package cn.fmm.java_learn.design_pattern.state_pattern.project;



/**
 * @author kdd
 * @time 2022/11/15
 * @desc 进入连麦状态（发起声网连麦）
 */
public class AudioTalkEnterState implements IState {

    // OVERRIDE METHODS FOR `IState`

    @Override
    public String getStateId() {
        return StateName.ENTER;
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
        return "AudioTalkEnterState{" +
                "stateId=" + getStateId() +
                '}';
    }

}

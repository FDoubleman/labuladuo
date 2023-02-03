package cn.fmm.java_learn.design_pattern.state_pattern;

import cn.fmm.java_learn.design_pattern.state_pattern.status.CloseStatus;
import cn.fmm.java_learn.design_pattern.state_pattern.status.OpenStatus;
import cn.fmm.java_learn.design_pattern.state_pattern.status.RunningStatus;
import cn.fmm.java_learn.design_pattern.state_pattern.status.Status;
import cn.fmm.java_learn.design_pattern.state_pattern.status.StopStatus;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 16:18
 * Dec : 电梯状态机
 **/
public class LiftStatusMachine {
    /**
     * 当前电梯状态
     */
    private Status curStatus;

    /**
     * 初始化所有电梯状态 电梯门打开、电梯门关闭、电梯运行、电梯停止
     */
    public final static Status sOpenStatus = new OpenStatus();
    public final static Status sCloseStatus = new CloseStatus();
    public final static Status sRunningStatus = new RunningStatus();
    public final static Status sStopStatus = new StopStatus();

    public LiftStatusMachine() {
        // 默认电梯是停止状态
        curStatus = new StopStatus();
        curStatus.setLiftStateMachine(this);
    }

    public Status getCurStatus(){
        return curStatus;
    }

    public void setCurStatus(Status status) {
        curStatus = status;
        curStatus.setLiftStateMachine(this);
    }

    public void open() {
        this.curStatus.open();
    }

    public void close() {
        this.curStatus.close();
    }

    public void running() {
        this.curStatus.running();
    }

    public void stop() {
        this.curStatus.stop();
    }
}

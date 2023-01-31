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
    public static Status sOpenStatus;
    public static Status sCloseStatus;
    public static Status sRunningStatus;
    public static Status sStopStatus;

    public LiftStatusMachine() {
        sOpenStatus = new OpenStatus(this);
        sCloseStatus = new CloseStatus(this);
        sRunningStatus = new RunningStatus(this);
        sStopStatus = new StopStatus(this);
        // 默认电梯是停止状态
        curStatus = new StopStatus(this);
    }

    public void setLiftStatus(Status status) {
        curStatus = status;
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

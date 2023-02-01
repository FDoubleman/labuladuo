package cn.fmm.java_learn.design_pattern.state_pattern.status;

import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:51
 * Dec : 状态接口
 **/
public abstract class Status {

    public LiftStatusMachine machine;

    public void setLiftStateMachine(LiftStatusMachine machine) {
        this.machine = machine;
    }

    public abstract void open();

    public abstract void close();

    public abstract void running();

    public abstract void stop();
}

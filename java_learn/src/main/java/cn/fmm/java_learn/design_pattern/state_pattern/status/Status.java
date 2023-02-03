package cn.fmm.java_learn.design_pattern.state_pattern.status;

import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:51
 * Dec : 状态接口
 **/
public abstract class Status {
    // 定义一个环境角色 ，提供子类访问
    public LiftStatusMachine machine;
    // 设置环境角色
    public void setLiftStateMachine(LiftStatusMachine machine) {
        this.machine = machine;
    }
    // 行为 方法
    public abstract void open();

    public abstract void close();

    public abstract void running();

    public abstract void stop();
}

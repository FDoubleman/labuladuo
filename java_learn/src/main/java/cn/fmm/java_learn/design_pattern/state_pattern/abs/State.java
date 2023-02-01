package cn.fmm.java_learn.design_pattern.state_pattern.abs;

/**
 * author:fumm
 * Date : 2023/ 02/ 01 14:09
 * Dec :抽象状态角色
 **/
public abstract class State {
    // 定义一个环境角色 ，提供子类访问
    protected StateMachine machine;
    // 设置环境角色
    public void setState(StateMachine machine) {
        this.machine = machine;
    }

    // 行为1
    public abstract void action1();

    // 行为2
    public abstract void action2();

}

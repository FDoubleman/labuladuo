package cn.fmm.java_learn.design_pattern.state_pattern.abs;

/**
 * author:fumm
 * Date : 2023/ 02/ 01 14:15
 * Dec : 具体状态角色2
 **/
public class ConcreteState2 extends State{
    @Override
    public void action1() {
        // 设置当前状态为 state1
        super.machine.setCurrentState(StateMachine.STATE1);
        // 过渡到state状态，由Context实现
        super.machine.action1();
    }

    @Override
    public void action2() {
        // 本状态下必须要处理的逻辑
    }
}

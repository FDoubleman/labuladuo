package cn.fmm.java_learn.design_pattern.state_pattern.abs;

/**
 * author:fumm
 * Date : 2023/ 02/ 01 14:15
 * Dec : 具体状态角色1
 **/
public class ConcreteState1 extends State{

    @Override
    public void action1() {
        // 转换到本状态下，必须要处理的逻辑
    }

    @Override
    public void action2() {
        // 设置当前状态 为state2
        super.machine.setCurrentState(StateMachine.STATE2);
        // 过渡到state2状态，由StateMachine实现
        super.machine.action2();
    }
}

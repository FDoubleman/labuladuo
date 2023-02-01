package cn.fmm.java_learn.design_pattern.state_pattern.abs;

/**
 * author:fumm
 * Date : 2023/ 02/ 01 14:12
 * Dec : 环境角色
 **/
public class StateMachine {

    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2  = new ConcreteState2();

    // 当前状态
    private State currentState;

    public StateMachine() {

    }

    // 获取当前状态
    public State getCurrentState() {
        return currentState;
    }

    // 设置当前状态
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        // 切换状态
        this.currentState.setState(this);
    }

    // 行为委托
    public void action1(){
        this.currentState.action1();
    }

    public void action2(){
        this.currentState.action2();
    }
}

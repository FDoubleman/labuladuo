package cn.fmm.java_learn.design_pattern.state_pattern;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:49
 * Dec : 状态机模式 测试类
 **/
public class StatePatternTest {


    public static void main(String[] args) {
        LiftStatusMachine machine = new LiftStatusMachine();
        machine.open();
        machine.stop();
        machine.running();
        machine.open();
        machine.close();
        machine.stop();
        machine.running();
        machine.stop();
        machine.open();
        machine.close();
        machine.close();
    }
}

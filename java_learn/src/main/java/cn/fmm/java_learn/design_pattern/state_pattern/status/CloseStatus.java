package cn.fmm.java_learn.design_pattern.state_pattern.status;


import cn.fmm.java_learn.common_utils.Log;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatus;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:58
 * Dec : 电梯关门状态
 **/
public class CloseStatus extends Status {
    public CloseStatus(LiftStatusMachine machine) {
        super(machine);
    }

    @Override
    public String getStatus() {
        return LiftStatus.status_close;
    }

    // 电梯关门状态 可以打开
    @Override
    public void open() {
        // 设置电梯为 打开状态
        machine.setLiftStatus(LiftStatusMachine.sOpenStatus);
        // 打开电梯
        machine.open();

    }

    @Override
    public void close() {
        Log.println("电梯关闭");
    }

    @Override
    public void running() {
        // 设置电梯为 运行状态
        machine.setLiftStatus(LiftStatusMachine.sRunningStatus);
        // 电梯运行
        machine.running();
    }

    @Override
    public void stop() {
        // 设置电梯为 停止状态
        machine.setLiftStatus(LiftStatusMachine.sStopStatus);
        // 电梯停止
        machine.stop();
    }
}

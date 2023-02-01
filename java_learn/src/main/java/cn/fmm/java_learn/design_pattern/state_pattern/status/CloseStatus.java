package cn.fmm.java_learn.design_pattern.state_pattern.status;


import cn.fmm.java_learn.common_utils.Log;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:58
 * Dec : 电梯关门状态
 **/
public class CloseStatus extends Status {


    // 电梯关门状态 可以打开
    @Override
    public void open() {
        // 设置电梯为 打开状态
        super.machine.setCurStatus(LiftStatusMachine.sOpenStatus);
        // 打开电梯
        super.machine.open();

    }

    @Override
    public void close() {
        Log.println("电梯关闭");
    }

    @Override
    public void running() {
        // 设置电梯为 运行状态
        super.machine.setCurStatus(LiftStatusMachine.sRunningStatus);
        // 电梯运行
        super.machine.running();
    }

    @Override
    public void stop() {
        // 设置电梯为 停止状态
        super.machine.setCurStatus(LiftStatusMachine.sStopStatus);
        // 电梯停止
        super.machine.stop();
    }
}

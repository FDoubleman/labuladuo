package cn.fmm.java_learn.design_pattern.state_pattern.status;

import cn.fmm.java_learn.common_utils.Log;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatus;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:58
 * Dec : 电梯停止状态
 **/
public class StopStatus extends Status {
    public StopStatus(LiftStatusMachine machine) {
        super(machine);
    }

    @Override
    public String getStatus() {
        return LiftStatus.status_stop;
    }

    @Override
    public void open() {
        // 电梯停止状态 可以打开电梯门
        machine.setLiftStatus(LiftStatusMachine.sOpenStatus);
        machine.open();
    }

    @Override
    public void close() {
        // 电梯停止状态 无法关闭电梯门(原本就是关闭的？？？)
        // no nothing
        Log.println("error 电梯停止无法再次关闭电梯门！close ");
    }

    @Override
    public void running() {
        // 电梯停止状态  可以再次运行
        machine.setLiftStatus(LiftStatusMachine.sRunningStatus);
        machine.running();
    }

    @Override
    public void stop() {
        Log.println("电梯 停止运行");
    }
}

package cn.fmm.java_learn.design_pattern.state_pattern.status;

import cn.fmm.java_learn.common_utils.Log;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatus;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:58
 * Dec : 电梯运行状态
 **/
public class RunningStatus extends Status {

    public RunningStatus(LiftStatusMachine machine) {
        super(machine);
    }

    @Override
    public String getStatus() {
        return LiftStatus.status_running;
    }

    @Override
    public void open() {
        // do nothing
        Log.println("error 电梯运行中 无法打开电梯门 open !!! ");
    }

    @Override
    public void close() {
        // do nothing
        Log.println("error 电梯运行中 无法再关闭电梯门 open !!! ");
    }

    @Override
    public void running() {
        Log.println("电梯上下运行中...");
    }

    @Override
    public void stop() {
        machine.setLiftStatus(LiftStatusMachine.sStopStatus);
        machine.stop();
    }
}

package cn.fmm.java_learn.design_pattern.state_pattern.status;

import cn.fmm.java_learn.common_utils.Log;
import cn.fmm.java_learn.design_pattern.state_pattern.LiftStatusMachine;

/**
 * author:fumm
 * Date : 2023/ 01/ 31 15:58
 * Dec : 电梯开门状态
 **/
public class OpenStatus extends Status {


    @Override
    public void open() {
        Log.println("电梯打开 ");
    }

    @Override
    public void close() {
        super.machine.setCurStatus(LiftStatusMachine.sCloseStatus);
        super.machine.close();
    }

    @Override
    public void running() {
        // do nothing
        Log.println("error 电梯门打开，无法运行 running ！！！");
    }

    @Override
    public void stop() {
        // do nothing
        Log.println("error 电梯门打开，无法停止 stop ！！！");
    }
}

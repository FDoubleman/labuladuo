package cn.fmm.java_learn.design_pattern.state_pattern.project;

/**
 * @author kdd
 * @time 2022/11/14
 * @desc 导学状态定义
 */
public interface StateName {

    // 初始状态（非导学状态）

    final String INITIAL = "learning_initial";


    // 导学提醒状态（展示前置提醒弹窗视图）

    final String PREPARE = "learning_prepare";


    // 进入连麦状态（发起声网连麦）

    final String ENTER = "learning_enter";


    // 正在连麦中（开关麦、开关白板等）

    final String RUNNING = "learning_running";

}

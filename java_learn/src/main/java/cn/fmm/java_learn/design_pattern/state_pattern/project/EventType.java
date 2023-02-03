package cn.fmm.java_learn.design_pattern.state_pattern.project;

/**
 * @author kdd
 * @time 2022/11/14
 * @desc 导学状态机事件定义
 */
public interface EventType {

    // 初始状态（非导学状态）

    final String EXIT_EVENT                     = "exit_learning";      // 退出导学（退出连麦、退出连麦和白板都触发这个命令）

    final String EXIT_SUB_EVENT_LEAVE           = "leave_channel";      // 主动离开
    final String EXIT_SUB_EVENT_EXCEPTION       = "get_exception";      // 发生异常
    final String EXIT_SUB_EVENT_TEACHER_OFFLINE = "teacher_offline";     // 老师掉线
    final String EXIT_SUB_EVENT_TEACHER_LEAVE   = "teacher_leave";      // 老师离开
    final String EXIT_SUB_EVENT_CONNECTION_LOST = "connection_lost";    // 断开连接


    // 导学提醒状态（展示前置提醒弹窗视图）

    final String PREPARE_EVENT = "prepare_learning";   // 展示连麦提醒弹窗


    // 发起连麦状态（导学提醒结束后触发这一事件）

    final String ENTER_EVENT = "enter_audio_talk";   // 进入连麦


    // 连麦中状态

    final String INSTRUCT_EVENT = "operate";

    final String INSTRUCT_SUB_EVENT_ON_MICROPHONE   = "on_microphone";      // 打开麦克风
    final String INSTRUCT_SUB_EVENT_OFF_MICROPHONE  = "off_microphone";     // 关闭麦克风
    final String INSTRUCT_SUB_EVENT_OPEN_WHITEBOARD = "open_whiteboard";    // 打开白板
    final String INSTRUCT_SUB_EVENT_CLOSE_WHITEBOARD = "close_whiteboard";   // 关闭白板

}

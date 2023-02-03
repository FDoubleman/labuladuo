package cn.fmm.java_learn.design_pattern.state_pattern.project;

/**
 * @author liang
 * @time 2022/11/14
 * @desc 状态接口定义，你需要在这里提供最终的代码实现
 */
public interface IState {

    /**
     * 获取状态标识
     */
    String getStateId();

    /**
     * 状态变更校验（在这里进行数据及状态校验等动作）
     * @return 校验通过返回 true，会继续执行 enter 方法；false 则结束本次状态变更
     */
    boolean valid(IState fromState, Event event);

    /**
     * 进入当前状态
     */
    void enter(IState fromState, Event event);

    /**
     * 离开当前状态
     */
    void exit();

}

package cn.fmm.java_learn.design_pattern.state_pattern.project;

import java.util.Map;

/**
 * @author liang
 * @time 2022/11/14
 * @desc 状态机事件定义
 */
public class Event {

    private String type;
    private String subType;
    private Map<String, Object> parameters;

    /**
     * 初始化事件
     * @param type 事件类型
     */
    public Event(String type) {
        this.type = type;
    }

    /**
     * 初始化事件
     * @param type 事件类型
     * @param parameters 事件携带参数
     */
    public Event(String type, Map<String, Object> parameters) {
        this.type = type;
        this.parameters = parameters;
    }

    /**
     * 初始化事件
     * @param type 事件类型
     * @param subType 子事件类型
     * @param parameters 事件携带参数
     */
    public Event(String type, String subType, Map<String, Object> parameters) {
        this.type = type;
        this.subType = subType;
        this.parameters = parameters;
    }


    // GETTER METHODS

    public String getType() {
        return type;
    }

    public String getSubType() {
        return subType;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }


    // OVERRIDE METHODS

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", subType='" + subType + '\'' +
                ", parameters=" + parameters +
                '}';
    }

}

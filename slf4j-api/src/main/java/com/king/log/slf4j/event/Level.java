package com.king.log.slf4j.event;


import static com.king.log.slf4j.event.EventConstants.*;

/**
 * @author arowana
 */
public enum Level {

    /**
     * 异常日志
     */
    ERROR(ERROR_INT, "ERROR"),

    /**
     * 警告日志
     */
    WARN(WARN_INT, "WARN"),

    /**
     * 提示日志
     */
    INFO(INFO_INT, "INFO"),

    /**
     * 调试日志
     */
    DEBUG(DEBUG_INT, "DEBUG"),

    /**
     * 链路日志
     */
    TRACE(TRACE_INT, "TRACE");

    private int levelInt;
    private String levelStr;

    Level(int i, String s) {
        levelInt = i;
        levelStr = s;
    }

    public int toInt() {
        return levelInt;
    }

    /**
     * 返回日志级别
     */
    @Override
    public String toString() {
        return levelStr;
    }

}

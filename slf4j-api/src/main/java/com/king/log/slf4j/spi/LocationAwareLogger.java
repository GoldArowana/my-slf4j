package com.king.log.slf4j.spi;

import com.king.log.slf4j.Logger;
import com.king.log.slf4j.Marker;

/**
 * 本接口主要用在 SLF4J 库与日志框架的连接方面.
 * 例如 jcl-over-slf4j, jul-to-slf4j 和 log4j-over-slf4j
 *
 * @author arowana
 */
public interface LocationAwareLogger extends Logger {

    /**
     * Printing method with support for location information.
     *
     * @param marker  The marker to be used for this event, may be null.
     * @param fqcn    The fully qualified class name of the <b>logger instance</b>,
     *                typically the logger class, logger bridge or a logger wrapper.
     * @param level   One of the level integers defined in this interface
     * @param message The message for the log event
     * @param t       Throwable associated with the log event, may be null.
     */
    public void log(Marker marker, String fqcn, int level, String message, Object[] argArray, Throwable t);

}

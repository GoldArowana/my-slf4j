package com.king.log.slf4j.event;


import com.king.log.slf4j.Marker;

/**
 * @author arowana
 */
public interface LoggingEvent {

    Level getLevel();

    Marker getMarker();

    String getLoggerName();

    String getMessage();

    String getThreadName();

    Object[] getArgumentArray();

    long getTimeStamp();

    Throwable getThrowable();

}

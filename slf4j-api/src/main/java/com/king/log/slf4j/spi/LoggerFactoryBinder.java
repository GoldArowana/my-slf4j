package com.king.log.slf4j.spi;


import com.king.log.slf4j.ILoggerFactory;

/**
 * 这是一个内部接口. 用于帮助静态的{@link com.king.log.slf4j.LoggerFactory} 类绑定
 * 合适的 {@link ILoggerFactory} 实例.
 *
 * @author arowana
 */
public interface LoggerFactoryBinder {

    /**
     * 返回{@link com.king.log.slf4j.LoggerFactory}类应该绑定的 {@link com.king.log.slf4j.ILoggerFactory} 实例.
     *
     * @return  {@link ILoggerFactory} 实例,
     * {@link com.king.log.slf4j.LoggerFactory} 类应该绑定的.
     */
    public ILoggerFactory getLoggerFactory();

    /**
     * The String form of the {@link ILoggerFactory} object that this
     * <code>LoggerFactoryBinder</code> instance is <em>intended</em> to return.
     *
     * <p>This method allows the developer to intterogate this binder's intention
     * which may be different from the {@link ILoggerFactory} instance it is able to
     * yield in practice. The discrepency should only occur in case of errors.
     *
     * @return the class name of the intended {@link ILoggerFactory} instance
     */
    public String getLoggerFactoryClassStr();
}

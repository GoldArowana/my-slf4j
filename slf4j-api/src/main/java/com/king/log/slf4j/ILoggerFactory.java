package com.king.log.slf4j;

/**
 * 用于获取 {@link Logger} 的工厂接口.
 * 这里有一个实现:{@link LoggerFactory#getLogger(String)}
 */
public interface ILoggerFactory {

    /**
     * 根据name返回logger.  如果是ROOT, name返回底层的根Logger.
     *
     * @param name 用于识别Logger的名字
     * @return 返回对应的Logger实例
     */
    public Logger getLogger(String name);
}
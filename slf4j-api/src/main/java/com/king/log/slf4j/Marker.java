package com.king.log.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/**
 * @author arowana
 */
public interface Marker extends Serializable {
    /**
     * This constant represents any marker, including a null marker.
     */
    String ANY_MARKER = "*";

    /**
     * This constant represents any non-null marker.
     */
    String ANY_NON_NULL_MARKER = "+";

    /**
     * 获取当前Marker实例的名字
     *
     * @return marker的名字
     */
    String getName();

    /**
     * 添加另一个marker的引用
     *
     * @param reference 另一个marker的引用
     * @throws IllegalArgumentException 如果reference等于null
     */
    void add(Marker reference);

    /**
     * 移除一个marker引用
     *
     * @param reference 要删除的marker
     * @return true 找到了指定的marker, 并成功删除. 否则返回false.
     */
    boolean remove(Marker reference);

    /**
     * 当前的marker有其他marker的引用吗?
     *
     * @return 返回是否有其他marker引用.
     * @deprecated 被这个方法替代: {@link #hasReferences()}.
     */
    boolean hasChildren();

    /**
     * 当前的marker有其他marker的引用吗?
     *
     * @return true 如果当前marker有其他的引用. 否则返回false
     */
    boolean hasReferences();

    /**
     * 返回一个迭代器, 遍历marker引用.
     *
     * @return 返回迭代器
     */
    Iterator<Marker> iterator();

    /**
     * other是否被当前marker引用.
     * other被A引用, A被当前marker引用, 那也算other被当前marker引用. (递归判断)
     *
     * @param other 入参.被判断对象.
     * @return 是否当前marker包含other
     * @throws IllegalArgumentException 如果 'other' == null
     */
    boolean contains(Marker other);

    /**
     * 判断当前marker是否包含名为name的marker.
     * 如果name==null, 那么肯定返回null
     *
     * @param name 用于判断这个名为name的marker是被否包含在当前marker
     * @return 是否当前marker包含这个名为name的marker
     */
    boolean contains(String name);

    /**
     * 用于判断是否是同一个marker.
     *
     * @param o 被比较的marker
     * @return true, 如果this.name 等于 o.name
     */
    @Override
    boolean equals(Object o);

    /**
     * 根据name来计算哈希值.
     * 一般name一样的话, 就会被认为是相等的.
     *
     * @return 计算出来的哈希值
     */
    @Override
    int hashCode();
}

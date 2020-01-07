package com.smart.website.activite.entity.pattern.filter;

/**
 * @author shawnzhan.zxy
 * @date 2018/04/17
 */
public interface FilterInvoker<T> {

    default void invoke(T context) {
    }
}

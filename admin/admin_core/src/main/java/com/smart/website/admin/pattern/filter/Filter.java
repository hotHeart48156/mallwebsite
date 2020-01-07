package com.smart.website.admin.pattern.filter;


/**
 *
 */
public interface Filter<T> {

    void doFilter(T context, FilterInvoker nextFilter);

}
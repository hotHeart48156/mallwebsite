package com.smart.website.account.pattern.filter;


/**
 *
 */
public interface Filter<T> {

    void doFilter(T context, FilterInvoker nextFilter);

}
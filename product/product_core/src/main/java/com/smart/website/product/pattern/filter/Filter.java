package com.smart.website.product.pattern.filter;


/**
 *
 */
public interface Filter<T> {

    void doFilter(T context, FilterInvoker nextFilter);

}
package com.smart.website.product_side.pattern.filter;


/**
 *
 */
public interface Filter<T> {

    void doFilter(T context, FilterInvoker nextFilter);

}
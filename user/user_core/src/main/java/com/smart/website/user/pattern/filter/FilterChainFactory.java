package com.smart.website.user.pattern.filter;

import com.smart.website.account.common.ApplicationContextHelper;

/**
 * @author shawnzhan.zxy
 * @date 2018/04/17
 */
public class FilterChainFactory {

    public static <T> FilterChain<T> buildFilterChain(Class... filterClsList) {
        FilterInvoker last = new FilterInvoker() {
        };
        FilterChain filterChain = new FilterChain();
        for (int i = filterClsList.length - 1; i >= 0; i--) {
            FilterInvoker next = last;
            Filter filter = (Filter) ApplicationContextHelper.getBean(filterClsList[i]);
            last = new FilterInvoker<T>() {
                @Override
                public void invoke(T context) {
                    filter.doFilter(context, next);
                }
            };
        }
        filterChain.setHeader(last);
        return filterChain;
    }


}

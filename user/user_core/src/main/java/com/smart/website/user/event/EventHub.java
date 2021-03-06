package com.smart.website.user.event;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.smart.website.account.exception.framework.ColaException;
import com.smart.website.accout.commons.event.EventI;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件控制中枢
 *
 * @author shawnzhan.zxy
 * @date 2017/11/20
 */
@SuppressWarnings("rawtypes")
@Component
public class EventHub {

    private ListMultimap<Class, EventHandlerI> eventRepository = ArrayListMultimap.create();


    private Map<Class, Class> responseRepository = new HashMap<>();

    public List<EventHandlerI> getEventHandler(Class eventClass) {
        List<EventHandlerI> eventHandlerIList = findHandler(eventClass);
        if (eventHandlerIList == null || eventHandlerIList.size() == 0) {
            throw new ColaException(eventClass + "is not registered in eventHub, please register first");
        }
        return eventHandlerIList;
    }

    /**
     * 注册事件
     *
     * @param eventClz
     * @param executor
     */
    public void register(Class<? extends EventI> eventClz, EventHandlerI executor) {
        eventRepository.put(eventClz, executor);
    }

    private List<EventHandlerI> findHandler(Class<? extends EventI> eventClass) {
        List<EventHandlerI> eventHandlerIList = null;
        Class cls = eventClass;
        eventHandlerIList = eventRepository.get(cls);
        return eventHandlerIList;
    }

}

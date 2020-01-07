package com.smart.website.admin.event;

/**
 * @author: caiqiang.w
 * @date: 2019/2/14
 * @description:
 */
public interface MessageQueueEventI extends EventI {
    String getEventType();

    String getEventTopic();
}

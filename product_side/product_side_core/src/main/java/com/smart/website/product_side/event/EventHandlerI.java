package com.smart.website.product_side.event;

import com.smart.website.accout.commons.event.EventI;

import javax.ws.rs.core.Response;
import java.util.concurrent.ExecutorService;


/**
 * event handler
 *
 * @author shawnzhan.zxy
 * @date 2017/11/20
 */
public interface EventHandlerI<R extends Response, E extends EventI> {

    default ExecutorService getExecutor() {
        return null;
    }

    Response execute(EventI event);
}

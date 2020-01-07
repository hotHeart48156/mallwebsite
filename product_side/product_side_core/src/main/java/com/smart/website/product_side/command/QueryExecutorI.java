package com.smart.website.product_side.command;


import javax.ws.rs.core.Response;

public interface QueryExecutorI<R extends Response, C extends Command> extends CommandExecutorI<R, C> {

}

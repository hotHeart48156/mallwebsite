package com.smart.website.orders.command;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Inherited
@Component
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PreInterceptor {

    Class<? extends Command>[] commands() default {};

}

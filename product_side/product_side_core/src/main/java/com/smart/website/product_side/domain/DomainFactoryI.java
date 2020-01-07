package com.smart.website.product_side.domain;

/**
 * 领域工厂
 *
 * @author xueliang.sxl
 */
public interface DomainFactoryI<T extends EntityObject> {

    T create();

}

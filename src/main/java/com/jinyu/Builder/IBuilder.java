package com.jinyu.Builder;

import com.jinyu.Builder.Product;

/**
 * @Description:
 *              建造器接口，定义product的表示和组件构建接口，
 *              表示，getProduct()方法
 *              组件构建，给Director实例组合调用来构造product
 * @Author jinyu.mei
 * @Date 2017/12/6 14:48
 * Version: V0.1
 */
public interface IBuilder {
    // 构建产品部件
    void buildPartA();

    void buildPartB();

    void buildPartC();

    // 获取产品方法
    Product getProduct();
}

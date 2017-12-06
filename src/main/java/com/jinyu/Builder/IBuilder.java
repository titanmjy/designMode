package com.jinyu.Builder;

/**
 * @Description:
 *              建造器接口，定义product的表示，getProduct()方法
 *              如果写成抽象类方式，getProduct()方法可以用模板方法模式给实现了
 *              另外的产品的具体部件构造，给接口（子类）实现
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

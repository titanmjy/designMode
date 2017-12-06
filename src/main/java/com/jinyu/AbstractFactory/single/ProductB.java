package com.jinyu.AbstractFactory.single;

import com.jinyu.AbstractFactory.AbstractProductB;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 9:59
 * Version: V0.1
 */
public class ProductB extends AbstractProductB {

    @Override
    public void privateMethod() {
        System.out.println("productB 自有方法实现");
    }
}

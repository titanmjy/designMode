package com.jinyu.AbstractFactory.single;

import com.jinyu.AbstractFactory.AbstractProductA;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 9:59
 * Version: V0.1
 */
public class ProductA extends AbstractProductA {
    @Override
    public void privateMethod() {
        System.out.println("ProductA自有方法实现");
    }
}

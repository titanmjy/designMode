package com.jinyu.AbstractFactory.multy;

import com.jinyu.AbstractFactory.AbstractProductB;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:03
 * Version: V0.1
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void privateMethod() {
        System.out.println("ProductB1自有方法实现");
    }
}

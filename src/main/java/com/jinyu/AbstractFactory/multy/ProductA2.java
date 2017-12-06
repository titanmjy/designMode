package com.jinyu.AbstractFactory.multy;

import com.jinyu.AbstractFactory.AbstractProductA;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:03
 * Version: V0.1
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void privateMethod() {
        System.out.println("ProductA2自有方法实现");
    }
}

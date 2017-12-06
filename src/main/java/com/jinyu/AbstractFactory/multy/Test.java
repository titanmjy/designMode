package com.jinyu.AbstractFactory.multy;

import com.jinyu.AbstractFactory.AbstractFactory;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:10
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory f1 = new Factory1();
        AbstractFactory f2 = new Factory2();
        f1.createProductA().privateMethod();
        f1.createProductB().privateMethod();
        f2.createProductA().privateMethod();
        f2.createProductB().privateMethod();
    }
}

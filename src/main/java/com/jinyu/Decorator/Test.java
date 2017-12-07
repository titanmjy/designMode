package com.jinyu.Decorator;

import java.util.Collection;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 16:26
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();
//        第一次装饰
        component = new ConcreteDecorator(component);
//        第二次装饰
        component = new ConcreteDecorator(component);
        component.operate();


    }
}

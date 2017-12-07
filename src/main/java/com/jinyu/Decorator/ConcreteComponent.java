package com.jinyu.Decorator;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 16:22
 * Version: V0.1
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void operate() {
        System.out.println("do something");
    }
}

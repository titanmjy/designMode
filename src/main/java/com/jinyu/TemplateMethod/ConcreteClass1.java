package com.jinyu.TemplateMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:46
 * Version: V0.1
 */
public class ConcreteClass1 extends TemplateClass {

    @Override
    protected void start() {
        System.out.println("in class1 start");
    }

    @Override
    protected void run() {
        System.out.println("in class1 run");
    }

    @Override
    protected void stop() {
        System.out.println("in class1 stop");
    }
}

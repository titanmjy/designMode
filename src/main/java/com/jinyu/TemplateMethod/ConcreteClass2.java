package com.jinyu.TemplateMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:47
 * Version: V0.1
 */
public class ConcreteClass2 extends TemplateClass {


    @Override
    protected void start() {
        System.out.println("in class2 start");
    }

    @Override
    protected void run() {
        System.out.println("in class2 run");
    }

    @Override
    protected void stop() {
        System.out.println("in class2 stop");
    }
}

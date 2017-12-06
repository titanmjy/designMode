package com.jinyu.TemplateMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:48
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        TemplateClass t1 = new  ConcreteClass1();
        TemplateClass t2 = new ConcreteClass2();
        t1.all();
        t2.all();
    }
}

package com.jinyu.Adapter;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 15:17
 * Version: V0.1
 */
public class Test {


    public static void main(String[] args) {
        // 目标调用方式
        ITarget target = new FineTarget();
        target.request();

        // 适配前的调用方式
        Adaptee target1 = new Adaptee();
        target1.doSomething();

        // 适配后的调用方式
        ITarget target2 = new Adapter();
        target2.request();

    }
}

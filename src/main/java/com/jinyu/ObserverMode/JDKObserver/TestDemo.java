package com.jinyu.ObserverMode.JDKObserver;


/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 11:23
 * Version: V0.1
 */
public class TestDemo {
    public static void main(String[] args) {
        Subject subject = new Subject(); //受查者
        MyObserver observer = new MyObserver();//观察者
        subject.addObserver(observer);
        subject.businessMethod(10);
    }
}

package com.jinyu.Adapter;

/**
 * 通过继承，或者内部类对象等方式来调用原来的方法
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 15:16
 * Version: V0.1
 */
public class Adapter extends Adaptee implements ITarget{


    /** 包装一个request()方法，调用原来的doSomething()方法 */
    @Override
    public void request() {
        super.doSomething();
    }
}

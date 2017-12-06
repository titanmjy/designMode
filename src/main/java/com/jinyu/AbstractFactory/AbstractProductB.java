package com.jinyu.AbstractFactory;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 9:47
 * Version: V0.1
 */
public abstract class AbstractProductB {
    public void shardMethod(){
        System.out.println("B系列各个产品的共有方法被调用");
    }

    public abstract void privateMethod();
}

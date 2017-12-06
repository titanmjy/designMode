package com.jinyu.AbstractFactory;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 9:46
 * Version: V0.1
 */
public abstract class AbstractProductA {
    public void shardMethod(){
        System.out.println("A系列各个产品的共有方法被调用");
    }

    public abstract void privateMethod();
}

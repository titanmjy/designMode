package com.jinyu.AbstractFactory.single;

import com.jinyu.AbstractFactory.AbstractFactory;
import com.jinyu.AbstractFactory.AbstractProductA;
import com.jinyu.AbstractFactory.AbstractProductB;

/**
 * @Description:
 *              与工厂方法区别，提供多个创建产品方法，调不同方法创建不同对象
 * @Author jinyu.mei
 * @Date 2017/12/6 9:58
 * Version: V0.1
 */
public class Factory extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB();
    }

    public static void main(String[] args){
        Factory f = new Factory();
        f.createProductA().privateMethod();
        f.createProductB().privateMethod();
    }
}

package com.jinyu.AbstractFactory.multy;

import com.jinyu.AbstractFactory.AbstractFactory;
import com.jinyu.AbstractFactory.AbstractProductA;
import com.jinyu.AbstractFactory.AbstractProductB;

/**
 * @Description:
 *              只生产2类产品
 * @Author jinyu.mei
 * @Date 2017/12/6 10:04
 * Version: V0.1
 */
public class Factory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}

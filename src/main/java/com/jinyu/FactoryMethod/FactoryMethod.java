package com.jinyu.FactoryMethod;

/**
 * @Description:
 *              创建一个产品对象，只需要知道这个产品的类名
 * @Author jinyu.mei
 * @Date 2017/12/5 15:13
 * Version: V0.1
 */
public class FactoryMethod implements Factory {

    @Override
    public Car makeCar(Class c) {
        Car car = null;
        try {
             car = (Car)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return car;
    }
}

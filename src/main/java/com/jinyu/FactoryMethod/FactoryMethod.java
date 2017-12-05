package com.jinyu.FactoryMethod;

/**
 * @Description:
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

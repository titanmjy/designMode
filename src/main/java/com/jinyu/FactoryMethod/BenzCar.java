package com.jinyu.FactoryMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/5 15:19
 * Version: V0.1
 */
public class BenzCar implements Car {

    @Override
    public String getManufacturer() {
        return "Benz";
    }

    @Override
    public void run() {
        System.out.println("run in Benz");
    }
}

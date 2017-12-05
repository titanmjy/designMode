package com.jinyu.FactoryMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/5 15:18
 * Version: V0.1
 */
public class BMWCar implements Car {


    @Override
    public String getManufacturer() {
        return "BMW";
    }

    @Override
    public void run() {
        System.out.println("run in BMW");
    }


}

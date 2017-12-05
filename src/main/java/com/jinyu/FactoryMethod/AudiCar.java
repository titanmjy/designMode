package com.jinyu.FactoryMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/5 15:18
 * Version: V0.1
 */
public class AudiCar implements Car {

    @Override
    public String getManufacturer() {
        return "Audi";
    }

    @Override
    public void run() {
        System.out.println("run in Audi");
    }
}

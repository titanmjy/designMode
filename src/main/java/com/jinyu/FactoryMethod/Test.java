package com.jinyu.FactoryMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/5 16:12
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        try {
            Car car = factoryMethod.makeCar(BMWCar.class);
            car.run();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.jinyu.Proxy.staticProxy;


/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:03
 * Version: V0.1
 */
public class RealSubject implements ISubject {
    private String name;

    public RealSubject(String name){
        this.name = name;
    }

    @Override
    public void begin() {
        System.out.println("realSubject begin");
    }

    @Override
    public void onwork() {
        System.out.println("realSubject onwork");
    }

    @Override
    public void end() {
        System.out.println("realSubject end");
    }
}

package com.jinyu.Proxy.staticProxy;

import com.jinyu.Prototype.PrototypeClass;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:03
 * Version: V0.1
 */
public class Proxy implements ISubject, ISomeElseSubject {

    private ISubject realSubject;

    public Proxy(String name){
        this.realSubject = new RealSubject(name);
    }

    @Override
    public void begin() {
        this.realSubject.begin();
    }

    @Override
    public void onwork() {
        System.out.println("something enhanced before onwork in proxy");
        this.realSubject.onwork();
        System.out.println("something enhanced after onwork in proxy");
    }

    @Override
    public void end() {
        this.realSubject.end();
    }

    @Override
    public void otherJob() {
        System.out.println("other jobs in proxy");
    }
}

package com.jinyu.ObserverMode.JDKObserver;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 11:22
 * Version: V0.1
 */
public class Subject extends java.util.Observable {

    void businessMethod(int period) {
        System.out.println("My business" );
        setChanged();   //这个不能少，不然不能成功调用
        notifyObservers(period);
    }
}

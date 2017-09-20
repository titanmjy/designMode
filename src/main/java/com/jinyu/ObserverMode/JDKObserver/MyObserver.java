package com.jinyu.ObserverMode.JDKObserver;

import java.util.Observable;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 11:22
 * Version: V0.1
 */
public class MyObserver  implements java.util.Observer  {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update() called, count is " + ((Integer) arg).intValue());
    }
}

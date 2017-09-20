package com.jinyu.Listener;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 10:55
 * Version: V0.1
 */
public class MyListenerImpl implements MyListener {

    @Override
    public void handleEvent(MyEvent dm) {
        System.out.println("Inside listener1...");
        dm.say();//回调
    }
}

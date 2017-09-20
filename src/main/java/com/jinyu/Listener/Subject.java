package com.jinyu.Listener;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 10:29
 * Version: V0.1
 */
public class Subject {
    private Vector repository = new Vector();//监听自己的监听器队列
    public Subject(){}

    // 添加监听
    public void addListener(MyListener listener) {
        repository.addElement(listener);
    }

    // 监听通知
    public void notifyDemoEvent() {//通知所有的监听器
        Enumeration eles = repository.elements();
        while(eles.hasMoreElements()) {
            MyListener listener = (MyListener)eles.nextElement();
            listener.handleEvent(new MyEvent(this));
        }
    }
}

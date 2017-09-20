package com.jinyu.ObserverMode.JDKListener;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 10:33
 * Version: V0.1
 */
public class TestDemo {
    public static void main(String args[]) {
        Subject subject = new Subject();
        //将监听器在事件源对象中登记：
        MyListener l1 = new MyListenerImpl();
        subject.addListener(l1);

        // 再加一个监听器
        subject.addListener(new MyListener() {
            public void handleEvent(MyEvent event) {
                System.out.println("Method come from 匿名类...");
            }
        });

        subject.notifyDemoEvent();//触发事件、通知监听器
    }
}

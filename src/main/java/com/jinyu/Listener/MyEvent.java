package com.jinyu.Listener;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 10:29
 * Version: V0.1
 */
// event是传给观察者的参数对象
public class MyEvent extends java.util.EventObject{
    public MyEvent(Object source) {
        //source—事件源对象—如在界面上发生的点击按钮事件中的按钮
        //所有 Event 在构造时都引用了对象 "source"，在逻辑上认为该对象是最初发生有关 Event 的对象
        super(source);
    }

    // 额外的回掉方法
    public void say() {
        System.out.println("This is say method...");
    }
}

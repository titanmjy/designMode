package com.jinyu.Proxy.nativeDynamic;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:26
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        ISubject subject2 = (ISubject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),  //realSubject类加载器
                subject.getClass().getInterfaces(),   //realSubject需要实现的接口的数组
                new MyInvocationHandler(subject));    //handler
        subject2.doSomething("ahaha");



        // 换个写法
        ISubject subject3 = (ISubject) Proxy.newProxyInstance(
                RealSubject.class.getClassLoader(),
                new Class<?>[]{ISubject.class},
                new MyInvocationHandler(new RealSubject()));
        subject3.doSomething("2");
        
    }
}

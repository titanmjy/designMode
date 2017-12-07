package com.jinyu.Proxy.aop;

import com.jinyu.Proxy.nativeDynamic.ISubject;
import com.jinyu.Proxy.nativeDynamic.MyInvocationHandler;
import com.jinyu.Proxy.nativeDynamic.RealSubject;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 14:45
 * Version: V0.1
 */
public class Test {

    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        ISubject proxy1 = (ISubject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),  //realSubject类加载器
                subject.getClass().getInterfaces(),   //realSubject需要实现的接口的数组
                new MyInvocationHandler(subject));    //handler

        IAdvice advice = new SomeAdvice();
        ISubject proxy2 = (ISubject) Proxy.newProxyInstance(proxy1.getClass().getClassLoader(),
                proxy1.getClass().getInterfaces(),
                new OutInnocationHandler(proxy1,advice));
        proxy2.doSomething("ahaha");


    }
}

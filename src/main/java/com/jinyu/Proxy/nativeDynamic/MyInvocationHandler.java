package com.jinyu.Proxy.nativeDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:21
 * Version: V0.1
 */
public class MyInvocationHandler implements InvocationHandler {

    // 被代理的对象
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 可以在这里做增强，把这里的增强单独出去就是AOP
        System.out.println("something before in invoke");
        Object obj =  method.invoke(this.target, args);
        System.out.println("something else in invoke");
        return obj;
    }
}

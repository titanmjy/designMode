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

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 可以在这里做增强
        System.out.println("something else before");
        Object obj =  method.invoke(this.target, args);
        System.out.println("something else after");
        return obj;
    }
}

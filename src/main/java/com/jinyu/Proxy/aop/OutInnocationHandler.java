package com.jinyu.Proxy.aop;

import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 14:42
 * Version: V0.1
 */
public class OutInnocationHandler implements InvocationHandler {

    // 第一层被代理的对象
    private Object proxy;

    // 包含增强方法的类对象
    private IAdvice advice;

    public OutInnocationHandler(Object proxy, IAdvice advice){
        this.proxy = proxy;
        this.advice = advice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        advice.before();
        Object pro = method.invoke(this.proxy,args);
        advice.after();
        return pro;
    }
}

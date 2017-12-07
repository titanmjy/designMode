package com.jinyu.Proxy.aop;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 14:39
 * Version: V0.1
 */
public class SomeAdvice implements IAdvice {


    @Override
    public void before() {
        System.out.println("in aop before");
    }

    @Override
    public void after() {
        System.out.println("in aop after");
    }
}

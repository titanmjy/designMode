package com.jinyu.Proxy.nativeDynamic;


/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:19
 * Version: V0.1
 */
public class RealSubject implements ISubject {


    @Override
    public void doSomething(String str) {
        System.out.println("do something ----" + str);
    }


}

package com.jinyu.Proxy.staticProxy;


/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 10:13
 * Version: V0.1
 */
public class Test {

    public static void main(String[] args) {
        Proxy proxy = new Proxy("a");
        proxy.begin();
        proxy.onwork();
        proxy.end();
        proxy.otherJob();
    }
}

package com.jinyu.ObserverMode.Callback.async;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/11/28 14:26
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {

        Li li = new Li();
        Wang wang = new Wang(li);
        wang.problem();
        wang.askQuestion("1 + 1 = ?");
    }
}

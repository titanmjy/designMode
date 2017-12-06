package com.jinyu.Prototype;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 16:48
 * Version: V0.1
 */
public class Test {

    public static void main(String[] args) {
        PrototypeClass p1 = new PrototypeClass();
        PrototypeClass p2 = p1.clone();
        p2.print();
    }
}

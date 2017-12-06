package com.jinyu.Builder;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 14:48
 * Version: V0.1
 */
public class Test {
    public static void main(String[] args) {
        IBuilder builder1 = new BuilderU();
        Director d1 = new Director(builder1);
        d1.construct();
        System.out.println(builder1.getProduct());


        IBuilder builder2 = new BuilderL();
        Director d2 = new Director(builder2);
        d2.construct();
        System.out.println(builder2.getProduct());

    }
}

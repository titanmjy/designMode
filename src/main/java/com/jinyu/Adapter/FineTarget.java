package com.jinyu.Adapter;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 15:18
 * Version: V0.1
 */
public class FineTarget implements ITarget {


    @Override
    public void request() {
        System.out.println("run in file target");
    }
}

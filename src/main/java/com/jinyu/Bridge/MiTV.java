package com.jinyu.Bridge;

/**
 * 抽象实现
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:38
 * Version: V0.1
 */
public class MiTV implements ITV {

    @Override
    public void on() {
        System.out.println("MiTV is turned on");
    }

    @Override
    public void off() {
        System.out.println("MiTV is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("MiTV channel is switched to : " + channel);
    }
}

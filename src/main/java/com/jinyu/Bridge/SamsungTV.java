package com.jinyu.Bridge;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:37
 * Version: V0.1
 */
public class SamsungTV implements ITV {

    @Override
    public void on() {
        System.out.println("SamsungTV is turned on");
    }

    @Override
    public void off() {
        System.out.println("SamsungTV is turned off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("SamsungTV channel is switched to:" + channel);
    }
}

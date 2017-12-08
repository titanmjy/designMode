package com.jinyu.Bridge;

/**
 * 具体接口
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:38
 * Version: V0.1
 */
public abstract class AbstractRemoteControl {

    private ITV tv;

    public AbstractRemoteControl(ITV tv){
        this.tv = tv;
    }

    public void turnOn(){
        tv.on();
    }

    public void turnOff(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}

package com.jinyu.Bridge;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:40
 * Version: V0.1
 */
public class MiController extends AbstractRemoteControl {

    public MiController(ITV tv) {
        super(tv);
    }

    @Override
    public void setChannel(int channel){
        super.setChannel(channel);
        System.out.println("Micontroller use keyword to set channel.");
    }
}

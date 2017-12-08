package com.jinyu.Bridge;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:41
 * Version: V0.1
 */
public class SamsungController extends AbstractRemoteControl{


    public SamsungController(ITV tv) {
        super(tv);
    }

    @Override
    public void setChannel(int channel){
        super.setChannel(channel);
        System.out.println("SamsungController use keyword to set channel.");
    }
}

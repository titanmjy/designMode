package com.jinyu.Bridge;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/8 9:44
 * Version: V0.1
 */
public class Test {

    public static void main(String[] args) {
        ITV tv = new MiTV();
        AbstractRemoteControl controller = new MiController(tv);
        controller.setChannel(100);
    }
}

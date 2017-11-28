package com.jinyu.ObserverMode.Callback.async;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/11/28 14:18
 * Version: V0.1
 */
public class Li {

    public void executeMessage(CallBack callBack, String question){
        System.out.println("  老李：小王问的问题--->" + question);

        //模拟需要很长时间的操作
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String result = "答案是2";

        callBack.solve(result);
    }

}

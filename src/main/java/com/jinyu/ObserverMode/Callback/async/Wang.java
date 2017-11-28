package com.jinyu.ObserverMode.Callback.async;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/11/28 14:18
 * Version: V0.1
 */
public class Wang implements CallBack {
    private Li li;

    public Wang(Li li){
        this.li = li;
    }

    public void askQuestion(final String question){
        //这里用一个线程就是异步
        new Thread(new Runnable() {
            @Override
            public void run() {
                li.executeMessage(Wang.this, question);
            }
        }).start();

        play();
    }

    public void problem(){
        System.out.println("遇到了一个问题，解决不了，问下老李");
    }

    public void play(){
        System.out.println("老李要研究下再回我。我要先逛街去了");
    }

    @Override
    public void solve(String result) {
        System.out.println("老李告诉我答案是--->" + result);
    }
}

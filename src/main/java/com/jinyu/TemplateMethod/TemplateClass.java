package com.jinyu.TemplateMethod;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 10:44
 * Version: V0.1
 */
public abstract class TemplateClass {

    protected abstract void start();

    protected abstract void run();

    protected abstract void stop();

    protected void all(){
        this.start();
        this.run();
        this.stop();
    }

}

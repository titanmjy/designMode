package com.jinyu.Listener;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/9/20 10:30
 * Version: V0.1
 */
public interface MyListener extends java.util.EventListener  {
    //EventListener是所有事件侦听器接口必须扩展的标记接口、因为它是无内容的标记接口、
    //所以事件处理方法由我们自己声明如下：
    public void handleEvent(MyEvent dm);

}

package com.jinyu.Observer;

/**
 * @Description: 观察者接口
 *               提供update()方法，负责被观察事件发生后的处理
 * @Author jinyu.mei
 * @Date 2017/9/20 9:22
 * Version: V0.1
 */
public interface Observer {
    public void update(String temperatureChange);
}

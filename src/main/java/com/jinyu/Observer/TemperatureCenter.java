package com.jinyu.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 具体主题类，被观察者，继承自subject接口
 * 本例 温度监测
 * @Author jinyu.mei
 * @Date 2017/9/20 9:24
 * Version: V0.1
 */
public class TemperatureCenter implements Subject{
    //主题类实例里边有观察者的实例，好调用他们的update方法
    private final List<Observer> observers;
    private float temperature;

    public TemperatureCenter(float temperature)
    {
        observers = new ArrayList<Observer>();
        this.temperature = temperature;
    }

    public float getTemperature()
    {
        return temperature;
    }



    // 监控的事件被触发，调用notifyObservers()通知观察者的方法
    public void setTemperature(final float temperature)
    {
        String notify = "";
        if(this.temperature < temperature){
            notify = "hot";
        }else if(this.temperature >temperature){
            notify = "cold";
        }
        this.notifyObservers(notify);
    }


    // 观察者注册，添加对象到列表
    @Override
    public void registerObserver(final Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o)
    {
        if (observers.indexOf(o) >= 0)
        {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers(String notify)
    {
        for (final Observer o : observers)
        {
            o.update(notify);
        }
    }
}

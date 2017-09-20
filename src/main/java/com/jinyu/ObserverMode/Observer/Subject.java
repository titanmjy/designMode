package com.jinyu.ObserverMode.Observer;

/**
 * @Description: 主题接口
 *               提供注册观察者，删除观察者和通知所有观察者三个方法
 * @Author jinyu.mei
 * @Date 2017/9/20 9:24
 * Version: V0.1
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers(String notify);
}

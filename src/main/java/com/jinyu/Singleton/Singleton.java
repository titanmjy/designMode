package com.jinyu.Singleton;


/**
 * @Description:
 *              构造方法为private，只有类内部可以调用
 *              instance属性被static修饰，在类被加载时就创建了实例，保证单例的线程安全
 * @Author jinyu.mei
 * @Date 2017/12/5 14:59
 * Version: V0.1
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}

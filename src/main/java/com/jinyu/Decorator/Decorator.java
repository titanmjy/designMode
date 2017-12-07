package com.jinyu.Decorator;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 16:22
 * Version: V0.1
 */
public abstract class Decorator implements IComponent{
    private IComponent component;

    public Decorator(IComponent component){
        this.component = component;
    }

    @Override
    public void operate(){
        this.component.operate();
    }

}

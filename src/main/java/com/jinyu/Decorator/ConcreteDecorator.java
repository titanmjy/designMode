package com.jinyu.Decorator;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/7 16:24
 * Version: V0.1
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(IComponent component) {
        super(component);
    }

    private void method(){
        System.out.println("in method1");
    }

    public void operate(){
        this.method();
        super.operate();
    }


}

package com.jinyu.Prototype;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 16:46
 * Version: V0.1
 */
public class PrototypeClass implements Cloneable {

    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try{
            prototypeClass = (PrototypeClass)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototypeClass;
    }

    public void print(){
        System.out.println("ahaha ~");
    }
}

package com.jinyu.Builder;

/**
 * @Description:
 *              导演类，实现对象的具体构造
 * @Author jinyu.mei
 * @Date 2017/12/6 14:48
 * Version: V0.1
 */
public class Director {
    private IBuilder builder;

    public Director(IBuilder builder){
        this.builder = builder;
    }

    public void construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
    }

    /**
     * 新的构建方法
     *  不同的组件构建方式，且可以直接返回产品
     * @return
     */
    public Product newConstruct(){
        this.builder.buildPartC();
        this.builder.buildPartA();
        this.builder.buildPartB();
        return this.builder.getProduct();
    }
}

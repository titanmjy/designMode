package com.jinyu.Builder;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 15:00
 * Version: V0.1
 */
public class BuilderU implements IBuilder {
    private String partA;
    private String partB;
    private String partC;


    @Override
    public void buildPartA() {
        this.partA = "A";
    }

    @Override
    public void buildPartB() {
        this.partB = "B";
    }

    @Override
    public void buildPartC() {
        this.partC = "C";
    }

    @Override
    public Product getProduct() {
        return new Product(partA,partB,partC);
    }
}

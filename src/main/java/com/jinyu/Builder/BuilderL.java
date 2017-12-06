package com.jinyu.Builder;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 15:02
 * Version: V0.1
 */
public class BuilderL implements IBuilder {
    private String partA;
    private String partB;
    private String partC;

    @Override
    public void buildPartA() {
        this.partA = "a";
    }

    @Override
    public void buildPartB() {
        this.partB = "b";
    }

    @Override
    public void buildPartC() {
        this.partC = "c";
    }

    @Override
    public Product getProduct() {
        return new Product(partA,partB,partC);
    }
}

package com.jinyu.Builder;

/**
 * @Description:
 * @Author jinyu.mei
 * @Date 2017/12/6 14:48
 * Version: V0.1
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;


    public Product(String partA, String partB, String partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }
}

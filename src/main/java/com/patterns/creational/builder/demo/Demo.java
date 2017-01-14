package com.patterns.creational.builder.demo;

import com.patterns.creational.builder.Builder;
import com.patterns.creational.builder.BuilderImpl1;
import com.patterns.creational.builder.Director;
import com.patterns.creational.builder.Product;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Builder builder = new BuilderImpl1();
        Director director = new Director(builder);
        Product product = director.constructProduct();
        System.out.println(product.getStr1()+product.getStr2()+product.getStr3());
    }
}

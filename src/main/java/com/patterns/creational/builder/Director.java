package com.patterns.creational.builder;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Director {
    Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Product constructProduct(){
        return builder.setStr1().setStr2().setStr3().build();
    }
}

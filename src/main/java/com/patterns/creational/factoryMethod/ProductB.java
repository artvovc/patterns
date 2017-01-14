package com.patterns.creational.factoryMethod;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ProductB implements Product {
    @Override
    public void method() {
        System.out.println(this.getClass().toString());
    }
}

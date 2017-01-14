package com.patterns.creational.abstractFactory;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ProductB2Impl implements ProductB {
    @Override
    public void productB() {
        System.out.println(this.getClass().toString());
    }
}

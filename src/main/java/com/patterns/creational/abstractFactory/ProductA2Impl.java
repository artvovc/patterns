package com.patterns.creational.abstractFactory;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ProductA2Impl implements ProductA {
    @Override
    public void productA() {
        System.out.println(this.getClass().toString());
    }
}

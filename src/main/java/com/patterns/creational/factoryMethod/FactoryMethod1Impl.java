package com.patterns.creational.factoryMethod;

/**
 * Created by Artemie on 14.01.2017.
 */
public class FactoryMethod1Impl implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductA();
    }
}

package com.patterns.creational.abstractFactory;

/**
 * Created by Artemie on 14.01.2017.
 */
public class AbstractFactory1Impl implements AbstractFactory {
    @Override
    public ProductA concreteFactoryA() {
        return new ProductA1Impl();
    }

    @Override
    public ProductB concreteFactoryB() {
        return new ProductB2Impl();
    }
}

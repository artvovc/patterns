package com.patterns.creational.abstractFactory.demo;

import com.patterns.creational.abstractFactory.AbstractFactory1Impl;
import com.patterns.creational.abstractFactory.AbstractFactory2Impl;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory1Impl abstractFactory1 = new AbstractFactory1Impl();
        AbstractFactory2Impl abstractFactory2 = new AbstractFactory2Impl();

        abstractFactory1.concreteFactoryA().productA();
        abstractFactory1.concreteFactoryB().productB();
        abstractFactory2.concreteFactoryA().productA();
        abstractFactory2.concreteFactoryB().productB();
    }
}

package com.patterns.creational.factoryMethod.demo;

import com.patterns.creational.factoryMethod.FactoryMethod;
import com.patterns.creational.factoryMethod.FactoryMethod1Impl;
import com.patterns.creational.factoryMethod.FactoryMethod2Impl;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod1Impl();
        factoryMethod.create().method();
        factoryMethod = new FactoryMethod2Impl();
        factoryMethod.create().method();
    }
}

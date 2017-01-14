package com.patterns.creational.builder;

/**
 * Created by Artemie on 14.01.2017.
 */
public interface Builder {
    Builder setStr1();
    Builder setStr2();
    Builder setStr3();
    Product build();
}

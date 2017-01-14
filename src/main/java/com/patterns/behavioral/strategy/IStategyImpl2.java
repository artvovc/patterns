package com.patterns.behavioral.strategy;

/**
 * Created by Artemie on 14.01.2017.
 */
public class IStategyImpl2 implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println(this.getClass().toString());
    }
}

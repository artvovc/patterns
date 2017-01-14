package com.patterns.behavioral.chainOfResponsability;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void doo(String str) {
        System.out.println(str+" "+this.getClass().toString());
    }
}

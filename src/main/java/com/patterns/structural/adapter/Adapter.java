package com.patterns.structural.adapter;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void do1() {
        this.iDo1();
    }

    @Override
    public void do2() {
        this.iDo2();
    }

    @Override
    public void do3() {
        this.iDo3();
    }
}

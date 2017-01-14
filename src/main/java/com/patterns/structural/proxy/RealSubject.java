package com.patterns.structural.proxy;

/**
 * Created by Artemie on 14.01.2017.
 */
public class RealSubject implements Subject {
    @Override
    public void method1() {
        System.out.println(this.getClass().toString()+ " method1");
    }

    @Override
    public void method2() {
        System.out.println(this.getClass().toString()+ " method2");
    }
}

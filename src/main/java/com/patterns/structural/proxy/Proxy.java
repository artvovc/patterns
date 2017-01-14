package com.patterns.structural.proxy;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Proxy implements Subject{

    RealSubject realSubject = new RealSubject();

    @Override
    public void method1() {
        System.out.print("call : ");
        realSubject.method1();
    }

    @Override
    public void method2() {
        System.out.print("call : ");
        realSubject.method2();
    }
}

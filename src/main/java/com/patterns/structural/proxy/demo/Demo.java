package com.patterns.structural.proxy.demo;

import com.patterns.structural.proxy.Proxy;
import com.patterns.structural.proxy.Subject;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.method1();
        subject.method2();
    }
}

package com.patterns.behavioral.chainOfResponsability.demo;

import com.patterns.behavioral.chainOfResponsability.ConcreteHandler1;
import com.patterns.behavioral.chainOfResponsability.ConcreteHandler2;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler1 handler3 = new ConcreteHandler1();
        handler2.setNextHandler(handler3);
        handler1.setNextHandler(handler2);

        handler1.print("blea");
    }
}

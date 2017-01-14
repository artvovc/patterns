package com.patterns.structural.brigde.demo;

import com.patterns.structural.brigde.*;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Implementator implementator = new ConcreteImplementator1();
        Abstraction abs = new RefinedAbstraction(implementator);
        abs.operation();
        abs = new RefinedAbstraction(new ConcreteImplementator2());
        abs.operation();
    }
}

package com.patterns.structural.decorator.demo;

import com.patterns.structural.decorator.ConcreteComponent;
import com.patterns.structural.decorator.ConcreteDecorator1;
import com.patterns.structural.decorator.ConcreteDecorator2;
import com.patterns.structural.decorator.Decorator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator1(new ConcreteDecorator2(concreteComponent));
        decorator.operation();
    }
}

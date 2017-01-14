package com.patterns.structural.decorator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println(this.getClass().toString());
        super.operation();
    }
}

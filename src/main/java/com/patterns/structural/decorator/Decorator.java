package com.patterns.structural.decorator;

/**
 * Created by Artemie on 14.01.2017.
 */
public abstract class Decorator implements Component{

    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

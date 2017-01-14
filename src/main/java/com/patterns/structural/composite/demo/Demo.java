package com.patterns.structural.composite.demo;

import com.patterns.structural.composite.Component;
import com.patterns.structural.composite.Composite;
import com.patterns.structural.composite.Leaf;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Component component = new Leaf();
        Component component1 = new Leaf();
        Component component2 = new Leaf();
        Component component3 = new Leaf();
        Composite compositeComponent = new Composite();
        Composite compositeComponent2 = new Composite();
        compositeComponent.setComponent(component);
        compositeComponent.setComponent(component1);
        compositeComponent.setComponent(component2);
        compositeComponent.setComponent(component3);
        Component component4 = new Leaf();
        compositeComponent2.setComponent(component4);
        compositeComponent.setComponent(compositeComponent2);
        compositeComponent.operation();
    }
}

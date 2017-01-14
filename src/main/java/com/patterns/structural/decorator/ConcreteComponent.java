package com.patterns.structural.decorator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println(this.getClass().toString());
    }
}

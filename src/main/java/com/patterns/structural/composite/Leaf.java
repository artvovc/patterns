package com.patterns.structural.composite;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println(this.getClass().toString());
    }
}

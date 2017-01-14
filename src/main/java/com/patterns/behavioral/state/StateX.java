package com.patterns.behavioral.state;

/**
 * Created by Artemie on 14.01.2017.
 */
public class StateX implements State {
    @Override
    public void operation() {
        System.out.println(this.getClass().toString());
    }
}

package com.patterns.structural.brigde;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ConcreteImplementator2 implements Implementator {
    @Override
    public void operationImpl() {
        System.out.println(this.getClass().toString());
    }
}

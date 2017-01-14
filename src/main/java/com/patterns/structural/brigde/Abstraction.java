package com.patterns.structural.brigde;

/**
 * Created by Artemie on 14.01.2017.
 */
public abstract class Abstraction {
    Implementator implementator;

    public Abstraction(Implementator implementator) {
        this.implementator = implementator;
    }

    public abstract void operation();
}

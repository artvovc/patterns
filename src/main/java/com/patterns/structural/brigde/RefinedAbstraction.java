package com.patterns.structural.brigde;

/**
 * Created by Artemie on 14.01.2017.
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementator implementator) {
        super(implementator);
    }

    @Override
    public void operation() {
        this.implementator.operationImpl();
    }
}

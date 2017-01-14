package com.patterns.behavioral.strategy;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Context {
    private IStrategy iStrategy;

    public void setiStrategy(IStrategy strategy){
        this.iStrategy = strategy;
    }

    public void operation(){
        this.iStrategy.algorithm();
    }
}

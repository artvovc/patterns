package com.patterns.creational.prototype;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Prototype1 implements Prototype {
    @Override
    public Prototype clone() {
        return new Prototype1();
    }

    public void method(){
        System.out.println(this.getClass().toString());
    }
}

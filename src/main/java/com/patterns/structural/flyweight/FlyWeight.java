package com.patterns.structural.flyweight;

/**
 * Created by Artemie on 14.01.2017.
 */
public abstract class FlyWeight {
    String str = "";

    public FlyWeight(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

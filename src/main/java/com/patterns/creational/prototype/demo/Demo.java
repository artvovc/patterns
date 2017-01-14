package com.patterns.creational.prototype.demo;

import com.patterns.creational.prototype.Prototype;
import com.patterns.creational.prototype.Prototype1;
import com.patterns.creational.prototype.Prototype2;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Prototype prototype = new Prototype1();

        Prototype1 prot = (Prototype1) prototype.clone();

        prot.method();
    }
}

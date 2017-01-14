package com.patterns.structural.adapter.demo;

import com.patterns.structural.adapter.Adapter;
import com.patterns.structural.adapter.Target;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.do1();
        target.do2();
        target.do3();
    }
}

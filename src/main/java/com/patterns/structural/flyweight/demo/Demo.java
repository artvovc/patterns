package com.patterns.structural.flyweight.demo;

import com.patterns.structural.flyweight.FlyWeightFactory;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        System.out.println(flyWeightFactory.getFly("1").getStr());
        System.out.println(flyWeightFactory.getFly("2").getStr());
        System.out.println(flyWeightFactory.getFly("2").getStr());
        System.out.println(flyWeightFactory.getFly("1").getStr());
        System.out.println(flyWeightFactory.getFly("1").getStr());
        System.out.println(flyWeightFactory.getFly("2").getStr());

    }
}

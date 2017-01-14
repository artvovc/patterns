package com.patterns.creational.solid.demo;

import com.patterns.creational.solid.SolidEager;
import com.patterns.creational.solid.SolidLazy;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        SolidLazy.getInstance().setStr("asd");
        SolidLazy.getInstance().getStr();
        SolidLazy.getInstance().getStr();
        SolidEager.getInstance().getStr();
        SolidEager.getInstance().getStr();


    }
}

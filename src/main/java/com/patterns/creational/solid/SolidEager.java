package com.patterns.creational.solid;

/**
 * Created by Artemie on 14.01.2017.
 */
public class SolidEager {
    private static SolidEager instance = new SolidEager();
    private SolidEager(){
    }

    String str = this.getClass().toString();

    public static SolidEager getInstance(){
        return instance;
    }

    public void getStr() {
        System.out.println(str);
    }

    public void setStr(String str) {
        this.str = str;
    }
}

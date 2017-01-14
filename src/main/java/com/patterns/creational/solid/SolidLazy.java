package com.patterns.creational.solid;

/**
 * Created by Artemie on 14.01.2017.
 */
public class SolidLazy {
    private static SolidLazy instance;
    private SolidLazy(){
    }

    String str = this.getClass().toString();

    public static SolidLazy getInstance(){
        if(instance == null)
            instance = new SolidLazy();
        return instance;
    }

    public void getStr() {
        System.out.println(str);
    }

    public void setStr(String str) {
        this.str = str;
    }
}

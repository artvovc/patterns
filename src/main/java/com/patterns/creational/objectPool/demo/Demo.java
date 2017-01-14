package com.patterns.creational.objectPool.demo;

import com.patterns.creational.objectPool.ObjectPool;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
//        System.out.println(((A) ObjectPool.getInstance().getReusable("mlea")).str);
        ObjectPool.getInstance().setMaxPoolSize(3);
        A a = new A();
        a.str = "mlea";
        ObjectPool.getInstance().setReusable("mlea", a);
        System.out.println(((A) ObjectPool.getInstance().getReusable("mlea")).str);
    }

}

class A{
    public String str;
}
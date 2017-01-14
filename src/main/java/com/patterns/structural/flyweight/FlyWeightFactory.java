package com.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artemie on 14.01.2017.
 */
public class FlyWeightFactory {
    private Map<String, FlyWeight> flys = new HashMap<>();
    public FlyWeight getFly(String key){
        if(!flys.containsKey(key)){
            switch(key){
                case "1":
                    System.out.println("create fly 1");
                    flys.put(key,new FlyWeight1("1"));
                    break;
                case "2":
                    System.out.println("create fly 2");
                    flys.put(key,new FlyWeight2("2"));
                    break;
                default: break;
            }
        }
        return flys.get(key);
    }
}

package com.patterns.creational.objectPool;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ObjectPool {
    private Map<String, Object> reusables = new HashMap<String,Object>();
    private static ObjectPool instance;
    private int maxPoolSize;

    private ObjectPool() {
    }

    public static ObjectPool getInstance() {
        if (instance == null)
            instance = new ObjectPool();
        return instance;
    }

    public void setReusable(String key,Object obj){
        if(reusables.size()<=maxPoolSize)
        reusables.put(key,obj);
    }

    public Object getReusable(String key){
        return reusables.get(key);
    }

    public void setMaxPoolSize(int size){
        this.maxPoolSize = size;
    }

}

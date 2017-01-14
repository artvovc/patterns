package com.patterns.behavioral.iterator.demo;

import com.patterns.behavioral.iterator.Iterator;
import com.patterns.behavioral.iterator.Repository;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Repository repository = new Repository();
        for(Iterator iter = repository.getIterator(); iter.hasNext();){
           String str = (String) iter.next();
            System.out.print(str);
        }
    }
}

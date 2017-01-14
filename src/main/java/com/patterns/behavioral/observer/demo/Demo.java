package com.patterns.behavioral.observer.demo;

import com.patterns.behavioral.observer.ObservableImpl;
import com.patterns.behavioral.observer.ObserverImpl;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        ObserverImpl observer = new ObserverImpl(observable);

        observable.change(1);
        observable.change(2);
        observable.change(3);

        System.out.println(observer.getStatus());

    }
}

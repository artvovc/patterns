package com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    int status;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deattach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObs() {
        observers.forEach(observer-> observer.update(status));
    }

    public void change(int status){
        this.status = status;
        notifyObs();
    }
}

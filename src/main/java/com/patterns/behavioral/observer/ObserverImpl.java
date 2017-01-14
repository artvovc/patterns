package com.patterns.behavioral.observer;

/**
 * Created by Artemie on 14.01.2017.
 */
public class ObserverImpl implements Observer {
    int status;

    public ObserverImpl(Observable observable) {
        observable.attach(this);
    }

    @Override
    public void update(int status) {
        this.status = status;
        System.out.println(this.getClass().toString() +" "+ status);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

package com.patterns.behavioral.observer;

/**
 * Created by Artemie on 14.01.2017.
 */
public interface Observable {
    void attach(Observer observer);
    void deattach(Observer observer);
    void notifyObs();
}

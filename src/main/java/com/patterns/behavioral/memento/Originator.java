package com.patterns.behavioral.memento;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Originator {
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        Memento memento = new Memento();
        memento.setState(this.state);
        return memento;
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }

}

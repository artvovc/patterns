package com.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 14.01.2017.
 */
public class CareTaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        this.mementos.add(memento);
    }

    public Memento restore(int index){
        return mementos.get(index);
    }
}

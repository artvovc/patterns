package com.patterns.behavioral.memento.demo;

import com.patterns.behavioral.memento.CareTaker;
import com.patterns.behavioral.memento.Originator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(1);
        careTaker.addMemento(originator.saveToMemento());
        originator.setState(0);
        careTaker.addMemento(originator.saveToMemento());
        System.out.println(originator.saveToMemento().getState());
        originator.restoreState(careTaker.restore(0));
        System.out.println(originator.saveToMemento().getState());
    }
}

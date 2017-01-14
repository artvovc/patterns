package com.patterns.behavioral.state;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Context {
    State state;

    public Context() {
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void operation(){
        state.operation();
    }
}

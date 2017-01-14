package com.patterns.behavioral.chainOfResponsability;

/**
 * Created by Artemie on 14.01.2017.
 */
public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void doo(String str);

    public void print(String msg){
        doo(msg);
        if(nextHandler!=null)
        this.nextHandler.print(msg);
    }
}

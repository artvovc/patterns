package com.patterns.behavioral.state.demo;

import com.patterns.behavioral.state.Context;
import com.patterns.behavioral.state.StateX;
import com.patterns.behavioral.state.StateY;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new StateX());
        ctx.operation();
        ctx.setState(new StateY());
        ctx.operation();
        ctx.setState(new StateY());
        ctx.operation();
        ctx.setState(new StateX());
        ctx.operation();
    }
}

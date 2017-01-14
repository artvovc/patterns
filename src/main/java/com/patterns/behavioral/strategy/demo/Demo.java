package com.patterns.behavioral.strategy.demo;

import com.patterns.behavioral.strategy.Context;
import com.patterns.behavioral.strategy.*;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setiStrategy(new IStategyImpl1());
        ctx.operation();

        ctx.setiStrategy(new IStategyImpl2());
        ctx.operation();
    }
}

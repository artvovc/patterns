package com.patterns.behavioral.mediator.demo;

import com.patterns.behavioral.mediator.IColleagueImpl1;
import com.patterns.behavioral.mediator.IColleagueImpl2;
import com.patterns.behavioral.mediator.IMeadiatorImpl;
import com.patterns.behavioral.mediator.IMediator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        IMediator mediator = new IMeadiatorImpl();

        IColleagueImpl1 colleagueImpl1 = new IColleagueImpl1(mediator);
        IColleagueImpl2 colleagueImpl2 = new IColleagueImpl2(mediator);

        mediator.doo1();
        mediator.doo2();

    }
}

package com.patterns.behavioral.mediator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class IColleagueImpl2 extends IColleague {
    public IColleagueImpl2(IMediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }
    @Override
    void execute() {
        System.out.println(this.getClass().toString());
    }
}

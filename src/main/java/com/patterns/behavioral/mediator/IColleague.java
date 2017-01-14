package com.patterns.behavioral.mediator;

/**
 * Created by Artemie on 14.01.2017.
 */
abstract class IColleague {
    IMediator mediator;
    abstract void execute();
}

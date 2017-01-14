package com.patterns.behavioral.mediator;

/**
 * Created by Artemie on 14.01.2017.
 */
public interface IMediator {
    void register(IColleagueImpl1 iColleagueImpl1);
    void register(IColleagueImpl2 iColleagueImpl2);
    void doo1();
    void doo2();
}

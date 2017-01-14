package com.patterns.behavioral.mediator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class IMeadiatorImpl implements IMediator {
    IColleagueImpl1 iColleagueImpl1;
    IColleagueImpl2 iColleagueImpl2;

    @Override
    public void register(IColleagueImpl1 iColleagueImpl1) {
        this.iColleagueImpl1 = iColleagueImpl1;
    }

    @Override
    public void register(IColleagueImpl2 iColleagueImpl2) {
        this.iColleagueImpl2 = iColleagueImpl2;
    }

    public void doo1(){
        this.iColleagueImpl1.execute();
    }

    public void doo2(){
        this.iColleagueImpl2.execute();
    }




}

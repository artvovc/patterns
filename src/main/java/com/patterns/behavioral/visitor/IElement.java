package com.patterns.behavioral.visitor;

/**
 * Created by Artemie on 14.01.2017.
 */
public interface IElement {
    void accept(Visitor visitor);
}

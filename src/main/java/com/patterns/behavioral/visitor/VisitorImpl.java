package com.patterns.behavioral.visitor;

/**
 * Created by Artemie on 14.01.2017.
 */
public class VisitorImpl implements Visitor {
    public void visit(IElementImpl element) {
        element.setState(1);
    }
}

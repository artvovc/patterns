package com.patterns.behavioral.visitor;

/**
 * Created by Artemie on 14.01.2017.
 */
public class IElementImpl implements IElement {
    private int state;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

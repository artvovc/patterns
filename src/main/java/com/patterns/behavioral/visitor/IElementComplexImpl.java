package com.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 14.01.2017.
 */
public class IElementComplexImpl implements IElement{
    private List<IElementImpl> elements = new ArrayList<>();

    public void setElem(IElementImpl element){
       this.elements.add(element);
    }

    public void print() {
        elements.forEach(iElement -> System.out.println(iElement.getState()));
    }

    public void accept(Visitor visitor) {
        elements.forEach(visitor::visit);
    }
}

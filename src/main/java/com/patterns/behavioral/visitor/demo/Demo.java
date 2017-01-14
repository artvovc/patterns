package com.patterns.behavioral.visitor.demo;

import com.patterns.behavioral.visitor.*;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        IElementImpl iElement = new IElementImpl();
        Visitor visitor = new VisitorImpl();
        iElement.accept(visitor);
        System.out.println(iElement.getState());

        IElementComplexImpl iElementComplex = new IElementComplexImpl();
        iElementComplex.setElem(new IElementImpl());
        iElementComplex.setElem(iElement);
        iElementComplex.setElem(new IElementImpl());
        visitor = new VisitorImplSetAllToZero();
        iElementComplex.accept(visitor);
        iElementComplex.print();

    }
}

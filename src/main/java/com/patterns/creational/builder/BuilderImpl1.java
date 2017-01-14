package com.patterns.creational.builder;

/**
 * Created by Artemie on 14.01.2017.
 */
public class BuilderImpl1 implements Builder{
    Product product = new Product();

    @Override
    public Builder setStr1() {
        product.setStr1("a");
        return this;
    }

    @Override
    public Builder setStr2() {
        product.setStr2("s");
        return this;
    }

    @Override
    public Builder setStr3() {
        product.setStr3("d");
        return this;
    }

    @Override
    public Product build() {
        return this.product;
    }
}

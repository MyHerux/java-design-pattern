package com.xu.design.FactoryMethod.AbstractFactory;

import com.xu.design.FactoryMethod.Factory1.Sender;

public interface Provider {
    public Sender produce();
}  
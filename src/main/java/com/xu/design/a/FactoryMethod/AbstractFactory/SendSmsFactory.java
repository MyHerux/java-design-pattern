package com.xu.design.a.FactoryMethod.AbstractFactory;

import com.xu.design.a.FactoryMethod.Factory1.Sender;
import com.xu.design.a.FactoryMethod.Factory1.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}  
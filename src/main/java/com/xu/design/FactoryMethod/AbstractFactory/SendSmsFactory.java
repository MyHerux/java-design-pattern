package com.xu.design.FactoryMethod.AbstractFactory;

import com.xu.design.FactoryMethod.Factory1.Sender;
import com.xu.design.FactoryMethod.Factory1.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}  
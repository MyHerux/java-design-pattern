package com.xu.design.a.FactoryMethod.Factory1;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}  
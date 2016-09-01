package com.xu.design.FactoryMethod.Factory1;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}  
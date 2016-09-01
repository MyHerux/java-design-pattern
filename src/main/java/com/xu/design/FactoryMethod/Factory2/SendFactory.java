package com.xu.design.FactoryMethod.Factory2;

import com.xu.design.FactoryMethod.Factory1.MailSender;
import com.xu.design.FactoryMethod.Factory1.Sender;
import com.xu.design.FactoryMethod.Factory1.SmsSender;

/**
 * 多个工厂方法模式,提供多个工厂方法，分别创建对象
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}  
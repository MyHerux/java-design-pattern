package com.xu.design.FactoryMethod.Factory3;

import com.xu.design.FactoryMethod.Factory1.MailSender;
import com.xu.design.FactoryMethod.Factory1.Sender;
import com.xu.design.FactoryMethod.Factory1.SmsSender;

/**
 * 静态工厂方法模式,工厂方法模式里的方法是静态的，不需要创建实例，直接调用即可
 */
public class SendFactory {
      
    public static Sender produceMail(){
        return new MailSender();
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();
    }

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}  
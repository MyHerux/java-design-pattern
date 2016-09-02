package com.xu.design.a.FactoryMethod.AbstractFactory;

import com.xu.design.a.FactoryMethod.Factory1.MailSender;
import com.xu.design.a.FactoryMethod.Factory1.Sender;

public class SendMailFactory implements Provider {
      
    @Override  
    public Sender produce(){
        return new MailSender();
    }  
}  
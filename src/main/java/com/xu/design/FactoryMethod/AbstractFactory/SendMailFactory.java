package com.xu.design.FactoryMethod.AbstractFactory;

import com.xu.design.FactoryMethod.Factory1.MailSender;
import com.xu.design.FactoryMethod.Factory1.Sender;

public class SendMailFactory implements Provider {
      
    @Override  
    public Sender produce(){
        return new MailSender();
    }  
}  
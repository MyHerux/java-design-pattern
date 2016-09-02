package com.xu.design.Builder;

import com.xu.design.FactoryMethod.Factory1.MailSender;
import com.xu.design.FactoryMethod.Factory1.Sender;
import com.xu.design.FactoryMethod.Factory1.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式（Builder）.
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 */
public class Builder {
      
    private List<Sender> list = new ArrayList<Sender>();
      
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());
        }  
    }
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.list.get(0).Send();
    }
}  
package com.xu.design.b.Proxy;

/**
 * 代理模式（Proxy）.
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 */
public class Proxy implements Sourceable {
  
    private Source source;  
    public Proxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  
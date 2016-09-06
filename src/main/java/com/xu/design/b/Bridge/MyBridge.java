package com.xu.design.b.Bridge;

public class MyBridge extends Bridge {
    public void method(){  
        getSource().method();  
    }  
}
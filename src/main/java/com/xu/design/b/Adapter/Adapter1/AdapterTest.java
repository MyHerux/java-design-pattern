package com.xu.design.b.Adapter.Adapter1;

/**
 * 这样Targetable接口的实现类就具有了Source类的功能。
 */
public class AdapterTest {
  
    public static void main(String[] args) {  
        Targetable target = new Adapter();  
        target.method1();  
        target.method2();  
    }  
}  
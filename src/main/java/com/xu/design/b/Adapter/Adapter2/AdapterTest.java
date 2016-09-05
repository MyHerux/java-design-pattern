package com.xu.design.b.Adapter.Adapter2;

import com.xu.design.b.Adapter.Adapter1.Source;
import com.xu.design.b.Adapter.Adapter1.Targetable;

public class AdapterTest {
  
    public static void main(String[] args) {  
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();  
        target.method2();  
    }  
}  
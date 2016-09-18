package com.xu.design.c.Strategy;

/**
 * 实现类
 */
public class Multiply extends AbstractCalculator implements ICalculator {
  
    @Override  
    public int calculate(String exp) {  
        int arrayInt[] = split(exp,"\\*");  
        return arrayInt[0]*arrayInt[1];  
    }  
}  
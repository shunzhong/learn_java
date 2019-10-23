package com.github.javabytecode.dynamicproxy.jdk;

public class LogAdvice implements Advice {
    @Override
    public void beforeMethod() {
        System.out.println("进入方法");
    }

    @Override
    public void afterMethod() {
        System.out.println("方法结束");
    }
}

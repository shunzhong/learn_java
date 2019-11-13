package com.github.designpattern.proxy.dynamic.advice;

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

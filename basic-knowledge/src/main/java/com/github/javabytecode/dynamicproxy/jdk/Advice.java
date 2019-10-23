package com.github.javabytecode.dynamicproxy.jdk;

public interface Advice {
    void beforeMethod();
    void afterMethod();
}

package com.github.designpattern.proxy.dynamic.cglib;

import com.github.designpattern.proxy.dynamic.advice.Advice;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Hacker implements MethodInterceptor {
    private Advice advice;

    public Hacker(Advice advice) {
        this.advice = advice;
    }
    @Override
    public Object intercept(Object proxy, Method method, Object[] paramArray, MethodProxy methodProxy) throws Throwable {
        advice.beforeMethod();
        method.invoke(proxy, paramArray);
        advice.afterMethod();
        return null;
    }
}

package com.github.designpattern.proxy.dynamic.jdk;

import com.github.designpattern.proxy.dynamic.advice.Advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ElectricCarInvocationHandler implements InvocationHandler {

    private ElectricCar car;
    private Advice advice;

    public ElectricCarInvocationHandler(ElectricCar car, Advice advice) {
        this.car = car;
        this.advice = advice;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] paramObjects) throws Throwable {

        advice.beforeMethod();
        Object result = method.invoke(car, paramObjects);
        advice.afterMethod();
        return result;
    }
}
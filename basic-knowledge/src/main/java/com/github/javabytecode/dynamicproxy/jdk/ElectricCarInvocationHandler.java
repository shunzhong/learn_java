package com.github.javabytecode.dynamicproxy.jdk;

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
    public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {

        advice.beforeMethod();
        paramMethod.invoke(car, null);
        advice.afterMethod();
        return null;
    }
}
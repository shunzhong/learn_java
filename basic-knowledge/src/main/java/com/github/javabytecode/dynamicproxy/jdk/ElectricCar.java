package com.github.javabytecode.dynamicproxy.jdk;

/**
 * 电能车类
 */
public class ElectricCar implements Rechargeable, Vehicle {

    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }

    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }
}

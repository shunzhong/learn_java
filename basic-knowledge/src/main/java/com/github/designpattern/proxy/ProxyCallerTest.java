package com.github.designpattern.proxy;

import com.github.designpattern.proxy.dynamic.advice.Advice;
import com.github.designpattern.proxy.dynamic.advice.LogAdvice;
import com.github.designpattern.proxy.dynamic.cglib.Hacker;
import com.github.designpattern.proxy.dynamic.jdk.ElectricCar;
import com.github.designpattern.proxy.dynamic.jdk.ElectricCarInvocationHandler;
import com.github.designpattern.proxy.dynamic.jdk.Rechargeable;
import com.github.designpattern.proxy.dynamic.jdk.Vehicle;
import com.github.designpattern.proxy.dynamic.cglib.Programmer;
import com.github.designpattern.proxy.static1.Station;
import com.github.designpattern.proxy.static1.StationProxy;
import com.github.designpattern.proxy.static1.TicketService;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理调用入口
 */
public class ProxyCallerTest {
    public static void main(String[] args) {
        callJdkDynamic();
//        callCglibDynamic();
    }

    private static void callJdkDynamic() {
        // 真实对象
        ElectricCar car = new ElectricCar();
        Advice advice = new LogAdvice();
        // 1.获取对应的ClassLoader
        ClassLoader classLoader = car.getClass().getClassLoader();

        // 2.获取ElectricCar 所实现的所有接口
        Class[] interfaces = car.getClass().getInterfaces();
        // 3.设置一个来自代理传过来的方法调用请求处理器，处理所有的代理对象上的方法调用
        InvocationHandler handler = new ElectricCarInvocationHandler(car, advice);
        /*
          4.根据上面提供的信息，创建代理对象 在这个过程中，
          a.JDK会通过根据传入的参数信息动态地在内存中创建和.class文件等同的字节码
          b.然后根据相应的字节码转换成对应的class，
          c.然后调用newInstance()创建实例
         */
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);

        Vehicle vehicle = (Vehicle) o;
        vehicle.drive();

        System.out.println("*******************");
        Rechargeable rechargeable = (Rechargeable) o;
        rechargeable.recharge();
    }

    private static  void callCglibDynamic() {
        Programmer programmer = new Programmer();
        Advice advice = new LogAdvice();
        Hacker hacker = new Hacker(advice);

        //cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(programmer.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(hacker);
        Programmer proxy = (Programmer) enhancer.create();
        proxy.code();
    }

    private static void callStaticProxy() {

        Station station =  new Station();

        TicketService proxy = new StationProxy(station);
        proxy.inquire();
    }
}

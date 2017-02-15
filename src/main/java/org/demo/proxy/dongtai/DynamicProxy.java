package org.demo.proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sally on 2017/2/13.
 * 使用DynamicProxy包装要代理的类
 * 使用getProxyInstance动态的创建一个我们要使用的代理类
 * 调用代理类的方法
 */
public class DynamicProxy implements InvocationHandler{
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public <T> T getProxy() {
        return (T)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),//该类的类加载器
                target.getClass().getInterfaces(),//该实现类的所有接口
                this  //动态代理对象
        );
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}

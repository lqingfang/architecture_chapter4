package org.demo.proxy.cglibdongtai;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by sally on 2017/2/15.
 */
public class CGLibProxy implements MethodInterceptor {

    /*
    以下到getInstance的部分属于 单例模式的实现，为的是使用时，不用再 new 对象
     */
    private static CGLibProxy instance = new CGLibProxy();

    public CGLibProxy() {
    }
    public static CGLibProxy getInstance() {
        return instance;
    }

    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(obj, args);
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

package org.demo.proxy.dongtai;

/**
 * Created by sally on 2017/2/13.
 * 使用DynamicProxy包装要代理的类
 * 使用getProxyInstance动态的创建一个我们要使用的代理类
 * 调用代理类的方法
 *
 * 动态代理与静态代理比较：
 * 动态代理：接口变了，动态代理类不用改变。（可以批量代理）
 * 静态代理：接口变了，实现类要变，静态代理类也要变(只能代理一个类)
 */
public class Test02 {
    public static void main(String[] args) {

        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl02());
        Hello2 hello2Proxy = dynamicProxy.getProxy();
        hello2Proxy.say("jack");
    }

}

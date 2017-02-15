package org.demo.proxy.cglibdongtai;

/**
 * Created by sally on 2017/2/15.
 * jdk代理和cglib代理区别：
 * cglib可以代理没有接口的类
 * cglib是在运行期间动态生成字节码的工具，也就是动态生成代理类
 */
public class Test03 {
    public static void main(String[] args) {
        //CGLibProxy没有实现单例模式的调用
//        CGLibProxy cgLibProxy = new CGLibProxy();
//        Hello3 helloProxy = cgLibProxy.getProxy(HelloImpl3.class);
//        helloProxy.say("jerry");
        //CGLibProxy实现单例模式的调用
        Hello3 helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl3.class);
        helloProxy.say("jerry");
        //CGLibProxy实现没有接口类的代理
        Hello4 hello4 = CGLibProxy.getInstance().getProxy(Hello4.class);
        hello4.say("kitty");
    }
}

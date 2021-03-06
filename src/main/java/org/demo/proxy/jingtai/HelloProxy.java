package org.demo.proxy.jingtai;

/**
 * Created by sally on 2017/2/13.
 */
public class HelloProxy implements Hello {
    private Hello hello;
    public HelloProxy() {
        hello = new HelloImpl();
    }

    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }

}

package org.demo.proxy.cglibdongtai;

/**
 * Created by sally on 2017/2/15.
 */
public class HelloImpl3 implements Hello3 {
    @Override
    public void say(String name) {
        System.out.println("hello"+name);
    }
}

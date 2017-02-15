package org.demo.proxy.jingtai;

/**
 * Created by sally on 2017/2/13.
 */
public class HelloImpl implements Hello{
    public void say(String name) {
        System.out.println("hello:"+name);
    }
}

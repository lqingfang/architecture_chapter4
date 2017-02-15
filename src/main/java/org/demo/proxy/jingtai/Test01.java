package org.demo.proxy.jingtai;

/**
 * Created by sally on 2017/2/13.
 * HelloImpl、HelloProxy都实现Hello接口
 * HelloProxy  中，将HelloImpl赋给Hello,实际还是HelloImpl在做事情
 * HelloProxy 只是完成了表面的工作。
 */
public class Test01 {
    public static void main(String[] args) {
        Hello hello = new HelloProxy();
        hello.say("jack");
    }
}

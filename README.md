# architecture_chapter4
静态代理：
 * HelloImpl、HelloProxy都实现Hello接口
 * HelloProxy  中，将HelloImpl赋给Hello,实际还是HelloImpl在做事情
 * HelloProxy 只是完成了表面的工作。  
 
动态代理：
 * 使用DynamicProxy包装要代理的类
 * 使用getProxyInstance动态的创建一个我们要使用的代理类
 * 调用代理类的方法  
 
cglib代理：
 *  实现MethodInterceptor
 *  填充intercept方法
 *  cglib提供的是方法级别的代理，直接调用methodProxy.invokeSuper(obj,args),传参即可。
 
动态代理与静态代理比较：
 * 动态代理：接口变了，动态代理类不用改变。（可以批量代理）
 * 静态代理：接口变了，实现类要变，静态代理类也要变(只能代理一个类)
 
jdk代理和cglib代理区别：
 * cglib可以代理没有接口的类
 * cglib是在运行期间动态生成字节码的工具，也就是动态生成代理类

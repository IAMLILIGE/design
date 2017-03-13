package proxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lilige on 17/3/11.
 */
public class CglibProxy implements MethodInterceptor {

    /**
     *
     * @param o 代理对象
     * @param method 被拦截的方法
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始方法前……");
        System.out.println(method.getName());
        Object o1 = methodProxy.invoke(o,args);
        return o1;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(AccountImpl.class);
        enhancer.setCallback(cglibProxy);

        AccountImpl accountProxy = (AccountImpl) enhancer.create();
        accountProxy.queryCount();
    }
}

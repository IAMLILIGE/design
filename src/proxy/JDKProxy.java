package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lilige on 17/3/11.
 * jdk动态代理
 */
public class JDKProxy implements InvocationHandler {
    private Object target;

    public JDKProxy() {
    }

    public JDKProxy(Object target) {
        this.target = target;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理:查询之前...排队");
        Object result = method.invoke(target, args);
        System.out.println("动态代理:查询之后...评价");
        return result;
    }

    public static void main(String[] args) {
        Account target = new AccountImpl();
        InvocationHandler proxyHandler = new JDKProxy(target);
        Account jdkProxy = (Account) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxyHandler);
        jdkProxy.queryCount();
    }
}

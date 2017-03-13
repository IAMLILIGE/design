package proxy;

/**
 * Created by lilige on 17/3/11.
 * 静态代理:
 * 代理类和被代理类都实现同一个接口
 * 被代理类作为代理类的 实例
 * 在代理类的A()中调用 被代理类实例的A()方法
 */
public class StaticProxy implements Account{

    private AccountImpl account;

    public StaticProxy(AccountImpl account) {
        this.account = account;
    }


    @Override
    public void queryCount() {
        System.out.println("查询之前...排队");
        account.queryCount();
        System.out.println("查询之后...评价");
    }

    public static void main(String[] args) {
        StaticProxy accountProxy = new StaticProxy(new AccountImpl());
        accountProxy.queryCount();
    }
}

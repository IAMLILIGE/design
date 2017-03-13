package singleton;

/**
 * Created by lilige on 17/2/20.
 * 懒汉式加载,保证线程安全
 * 要点:
 * 1.私有的构造方法 ;
 * 2.静态变量及静态方法;
 * 3.对象第一次使用时创建;
 */
public class LazySingleton {
    private static LazySingleton singleton;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if (null == singleton){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

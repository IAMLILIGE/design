package singleton;

/**
 * Created by lilige on 17/2/20.
 * 饿汉式单例
 * 要点:
 * 1.私有构造方法
 * 2.静态变量及静态方法
 * 3:初始化创建对象
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}

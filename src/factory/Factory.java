package factory;

/**
 * Created by lilige on 17/2/20.
 * 普通工厂:产品抽象 + 工厂也抽象
 * 苹果工厂只生产水果-苹果
 * 接收用fruit ,工厂用 factory
 */
public interface Factory {
    Fruit getInstance();
}

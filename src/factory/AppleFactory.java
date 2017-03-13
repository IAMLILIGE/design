package factory;

/**
 * Created by lilige on 17/2/21.
 * 工厂:抽象工厂
 */
public class AppleFactory implements Factory {
    @Override
    public Apple getInstance() {
        return new Apple();
    }
}

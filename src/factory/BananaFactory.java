package factory;

/**
 * Created by lilige on 17/2/21.
 * 工厂:抽象工厂
 */
public class BananaFactory implements Factory{
    @Override
    public Fruit getInstance() {
        return new Banana();
    }
}

package factory;

/**
 * Created by lilige on 17/2/21.
 */
public class FactoryUse {
    public static void main(String[] args) {
        //使用一个简单工厂
        Fruit simpleFruit = SimpleFactory.getInstance("banana");
        simpleFruit.eat();

        //使用工厂模式
        Factory factory = new AppleFactory();
        Fruit fruit = factory.getInstance();
        fruit.eat();
    }

}

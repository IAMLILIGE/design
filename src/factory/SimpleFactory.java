package factory;

/**
 * Created by lilige on 17/2/20.
 * 简单工厂:只有产品抽象了
 */
public class SimpleFactory {
    public static Fruit getInstance(String name){
        Fruit fruit = null;
        switch(name){
            case "apple":
                fruit = new Apple();
                break;
            case "banana":
                fruit = new Banana();
                break;
        }
        return fruit;
    }

}

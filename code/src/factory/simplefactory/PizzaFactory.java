package factory.simplefactory;

import java.util.Objects;

/**
 * description  简单工厂模式
 *
 * @author liuzhixiang 2020/07/25 8:48
 */
public class PizzaFactory {
    public static Pizza createPizza(String type){
        switch (type) {
            case "BJ": return new BJPizza();
            case "JX": return new JXPizza();
            default:
                break;
        }
        return null;
    }
}

package factory.simplefactory;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 8:54
 */
public class Order {

    public static void main(String[] args) {
        String type = "JX";
        Pizza pizza = PizzaFactory.createPizza(type);
        pizza.make();
    }
}

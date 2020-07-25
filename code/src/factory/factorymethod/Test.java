package factory.factorymethod;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:13
 */
public class Test {
    public static void main(String[] args) {
        BJPizzaFactory factory = new BJPizzaFactory();
        String type = "01";
        Shop shop = new Shop(factory);
        Pizza pizza = shop.order(type);
        System.out.println(pizza.toString());
    }
}

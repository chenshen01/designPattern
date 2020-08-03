package decorator;

/**
 * description
 *
 * @author liuzhixiang 2020/08/03 22:27
 */
public class DecoratorClient {
    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        simpleCoffee.cost();
        Milk milk = new Milk(simpleCoffee);
        milk.cost();
    }
}

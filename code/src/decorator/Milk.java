package decorator;

/**
 * description
 *
 * @author liuzhixiang 2020/08/03 22:34
 */
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public void cost() {
        decoratedCoffee.cost();
        System.out.println("此时加了牛奶");
    }
}

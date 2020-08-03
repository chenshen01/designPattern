package decorator;

/**
 * description
 *
 * @author liuzhixiang 2020/08/03 22:31
 */
public class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public void cost() {
        decoratedCoffee.cost();
    }
}

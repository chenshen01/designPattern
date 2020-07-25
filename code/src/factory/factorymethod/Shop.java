package factory.factorymethod;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:08
 */
public class Shop {
    private OrderPizza factory;
    public Shop(OrderPizza factory){
      this.factory = factory;
    }

    public Pizza order(String type){
        return factory.createPizza(type);
    }
}

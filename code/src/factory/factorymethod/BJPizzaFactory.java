package factory.factorymethod;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:03
 */
public class BJPizzaFactory extends OrderPizza {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "01": return new BJ01Pizza();
            case "02": return new BJ02Pizza();
            default:
                break;
        }
        return null;
    }
}

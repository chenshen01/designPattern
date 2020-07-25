package factory.factorymethod;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:06
 */
public class JXPizzaFactory extends OrderPizza {

    @Override
    public Pizza createPizza(String type) {
       switch (type){
           case "01":return new JX01Pizza();
           case "02":return new JX02Pizza();
           default:
               break;
       }
       return null;
    }
}

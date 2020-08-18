package mediator;

import java.util.HashMap;

/**
 * description
 *
 * @author liuzhixiang 2020/08/18 17:27
 */
public class MediatorClient {
    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();
        //创建 Alarm  并且加入到	ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建了 CoffeeMachine 对象，并且加入到	ConcreteMediator 对象的 HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeeMachine");
        Tv tv = new Tv(mediator, "TV");
        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.endCoffee();
        alarm.sendAlarm(1);
    }
}

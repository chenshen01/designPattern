package mediator;

import java.util.HashMap;

/**
 * description 具体的中介者类
 *
 * 1)	多个类相互耦合，会形成网状结构, 使用中介者模式将网状结构分离为星型结构，进行解耦
 * 2)	减少类间依赖，降低了耦合，符合迪米特原则
 * 3)	中介者承担了较多的责任，一旦中介者出现了问题，整个系统就会受到影响
 * 4)	如果设计不当，中介者对象本身变得过于复杂，这点在实际使用时，要特别注意
 *
 * @author liuzhixiang 2020/08/18 11:49
 */
public class ConcreteMediator extends Mediator{

    /**
     *  集合，放入所有的同事对象
     */
    private HashMap<String, Colleague> colleagueMap;

    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    /**
     * 注册同事类
     * @param colleagueName
     * @param colleague
     */
    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);

        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof Tv) {
            interMap.put("TV", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        // 处理从闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                // 开始做咖啡
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                // 打开电视
                ((Tv) (colleagueMap.get(interMap.get("TV")))).startTv();
            } else if (stateChange == 1) {
                ((Tv) (colleagueMap.get(interMap.get("TV")))).endTv();
            }
        }
        // 处理其他同事消息
    }

    @Override
    public void sendMessage() {

    }
}

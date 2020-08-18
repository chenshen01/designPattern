package mediator;

/**
 * description 具体的同事类 闹钟
 *
 * @author liuzhixiang 2020/08/18 15:32
 */
public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        // 在创建 Alarm 同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        // 调用的中介者对象的getMessage
        this.getMediator().getMessage(stateChange,this.name);
    }
}

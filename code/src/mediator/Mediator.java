package mediator;

/**
 * description 抽象中介者
 *
 * @author liuzhixiang 2020/08/18 11:44
 */
public abstract class Mediator {
    /**
     *  将给中介者对象，加入到集合中
     */
    public abstract void register(String colleagueName, Colleague colleague);

    /**
     * 接收消息, 具体的同事对象发出
     * @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}

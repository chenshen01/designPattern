package mediator;

/**
 * description  同事类
 *
 * @author liuzhixiang 2020/08/18 11:45
 */
public abstract class Colleague {
    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}

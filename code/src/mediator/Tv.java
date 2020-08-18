package mediator;

/**
 * description 具体的同事类 电视
 *
 * @author liuzhixiang 2020/08/18 17:00
 */
public class Tv extends Colleague{

    public Tv(Mediator mediator, String name){
        super(mediator, name);
        mediator.register(name,this);
    }


    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startTv(){
        System.out.println("It's time to StartTv!");
    }

    public void endTv(){
        System.out.println("StopTv!");
    }
}

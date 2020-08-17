package observer;

/**
 * description 观测的抽象类
 *
 * @author liuzhixiang 2020/08/17 23:44
 */
public abstract class AbstractObserver implements IObserver,DisplayElement{

    protected float temp;

    protected Subject weatherStation;

    public AbstractObserver(Subject weatherStation){
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    /**
     * 由其具体观测者进行实现
     */
    @Override
    public abstract void display();

    @Override
    public void update(float temp) {
        this.temp = temp;
        display();
    }
}

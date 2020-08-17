package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * description 气象站实现主题，发布气象信息（气温）
 *
 * @author liuzhixiang 2020/08/17 22:42
 */
public class WeatherStation implements Subject{

    /**
     * 观察者
     */
    private List<IObserver> IObservers;

    private float temp;

    /**
     * 加个ArrayList存放所有注册的Observer对象;
     */
    public WeatherStation() {
        this.IObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.IObservers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (this.IObservers.contains(observer)) {
            IObservers.remove(observer);
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * 更新状态，调用Observer的update告诉观察者有新的信息
     */
    @Override
    public void notifyObserver() {
        if (!this.IObservers.isEmpty()) {
            IObservers.forEach(observer -> observer.update(temp));
        }
    }

    /**
     * 此方法用于气象站收到的数据,并且调用更新使数据实时通知给观察者
     * @param temp
     */
    public void setMeasurements(float temp){
        this.temp = temp;
        System.out.println("气象站测量的温度为：" + temp + "℃");
        // 通知各个观测平台
        notifyObserver();
    }
}

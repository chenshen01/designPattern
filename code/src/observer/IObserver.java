package observer;

/**
 * description 观察者
 *
 * @author liuzhixiang 2020/08/17 22:40
 */
public interface IObserver {
    /**
     * 当气象站观测的天气发生变化时，主题会把参数值传给观察者
     * @param temp
     */
    void update(float temp);
}

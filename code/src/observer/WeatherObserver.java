package observer;

/**
 * description  天气观测站
 *
 * [观察者模式]
 *
 * 观测者模式定义了对象之间的一对多依赖，当一个对象状态发生改变时，其依赖者便会收到通知并做相应的更新。
 * 其原则是：为交互对象之间松耦合。以松耦合方式在一系列对象之间沟通状态，我们可以独立复用主题（Subject）/可观测者（Observable）
 * 和观测者（Observer），即只要遵守接口规则改变其中一方并不会影响到另一方。这也是其主要的设计原则。
 *
 * @author liuzhixiang 2020/08/17 22:26
 */
public class WeatherObserver {
    public static void main(String[] args) {
        // 首先创建一个主题/被观察者
        WeatherStation weatherStation = new WeatherStation();
        // 创建观察者并将被观察者对象传入
        ConditionDisplay conditionDisplay = new ConditionDisplay(weatherStation);
        // 创建一个手机app
        new AppDisplay(weatherStation);
        // 设置气象站模拟收到的气温数据
        weatherStation.setMeasurements(25);
        weatherStation.setMeasurements(24);
        weatherStation.setMeasurements(23);
    }
}

package observer;

/**
 * description 布告板上的状态显示
 *
 * @author liuzhixiang 2020/08/17 23:31
 */
public class ConditionDisplay extends AbstractObserver{

    /**
     * 构造时需要间主题/被观察者对象作为注册之用
     * @param weatherStation
     */
    public ConditionDisplay(Subject weatherStation){
       super(weatherStation);
    }

    /**
     * 将数据显示在布告板上
     */
    @Override
    public void display() {
        System.out.println("布告板显示当前温度为：" + temp + "℃");
    }

}

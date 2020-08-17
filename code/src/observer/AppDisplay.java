package observer;

/**
 * description 手机观测app
 *
 * @author liuzhixiang 2020/08/17 23:38
 */
public class AppDisplay extends AbstractObserver{

    public AppDisplay(Subject weatherStation){
        super(weatherStation);
    }

    @Override
    public void display() {
        System.out.println("手机app显示当前温度为：" + temp + "℃");
    }

}

package template;

/**
 * description
 *
 * @author liuzhixiang 2020/08/10 16:25
 */
public class MyCook extends Cook{

    @Override
    public void oil() {
        System.out.println("加10斤油");
    }

    @Override
    public void egg() {
        System.out.println("加一个鸡蛋");
    }

    @Override
    public void tomato() {
        System.out.println("加一个西红柿");
    }
}

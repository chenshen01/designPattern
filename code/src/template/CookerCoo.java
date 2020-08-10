package template;

/**
 * description
 *
 * @author liuzhixiang 2020/08/10 16:27
 */
public class CookerCoo extends Cook {

    @Override
    public void oil() {
        System.out.println("加20斤油");
    }

    @Override
    public void egg() {
        System.out.println("加2个鸡蛋");
    }

    @Override
    public void tomato() {
        System.out.println("加3个西红柿");
    }


    /**
     * 钩子方法--是否加油
     *
     * @author liuzhixiang 2020-08-10 16:24
     * @return
     */
    @Override
    protected boolean addOil(){
        return true;
    }
}

package template;

/**
 * description 模板类
 *
 * @author liuzhixiang 2020/08/10 16:20
 */
public abstract class Cook {
    public abstract void oil();

    public abstract void egg();

    public abstract void tomato();

    protected final void make(){
        if (this.addOil()) {
            this.oil();
        } else {
            System.out.println("不加油");
        }
        this.egg();
        this.tomato();
    }

    /**
     * 钩子方法--是否加油
     *
     * @author liuzhixiang 2020-08-10 16:24
     * @return
     */
    protected boolean addOil(){
        return false;
    }
}

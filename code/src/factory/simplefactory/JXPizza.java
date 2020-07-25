package factory.simplefactory;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 8:45
 */
public class JXPizza extends Pizza {
    public JXPizza(){
        this.setName("JXPizza");
    }
    @Override
    public String toString() {
        return "====" + this.getName() + "====";
    }
}

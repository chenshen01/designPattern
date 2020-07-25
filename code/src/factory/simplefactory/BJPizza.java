package factory.simplefactory;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 8:44
 */
public class BJPizza extends Pizza {
    public BJPizza(){
        this.setName("BJPizza");
    }
    @Override
    public String toString() {
        return "====" + this.getName() + "====";
    }
}

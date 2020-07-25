package factory.simplefactory;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 8:42
 */
public class Pizza {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void make(){
        System.out.println("make------->" + this.name);
    }
}

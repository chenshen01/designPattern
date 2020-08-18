package memento;

/**
 * description 备忘录角色类
 *  备忘录对象将 发起人对象 传入的状态存储起来。
 *
 * @author liuzhixiang 2020/08/18 21:54
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

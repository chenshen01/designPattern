package memento;

/**
 * description 客户端角色类
 *
 * <tip>
 *     备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是对象的行为模式。
 * 　　 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，
 *     将一个对象的状态捕捉(Capture)住，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到
 *     存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
 * </tip>
 *
 * @see https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html
 * @author liuzhixiang 2020/08/18 21:59
 */
public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        // 设置了发起人的状态
        originator.setState("on");
        // 创建备忘录对象，并将发起人对象的状态储存起来
        caretaker.saveMemento(originator.createMemento());
        // 改变发起人的状态
        originator.setState("off");
        // 恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("恢复到之前状态：" + originator.getState());
    }
}

package singleton;

/**
 * description
 *
 * 	优缺点说明：
 *
 * 1)	解决了线程安全问题
 * 2)	效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。
 * 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
 * 直接 return 就行了。方法进行同步效率太低
 * 3)	结论：在实际开发中，不推荐使用这种方式
 *
 * @author liuzhixiang 2020/07/24 23:18
 */
public class SingletonUseSynchronized1 {
    private static SingletonUseSynchronized1 instance;

    private SingletonUseSynchronized1() {

    }

    /**
     * <p>
     * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
     * [即懒汉式]
     * </p>
     * 
     * @author liuzhixiang 2020/07/24 23:20
     */
    public synchronized SingletonUseSynchronized1 getInstance(){
        if (instance == null) {
            instance = new SingletonUseSynchronized1();
        }
        return instance;
    }
}

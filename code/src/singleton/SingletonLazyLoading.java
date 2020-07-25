package singleton;

/**
 * description
 *
 * 	优缺点说明：
 *
 * 1)	起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 * 2)	如果在多线程下，一个线程进入了 if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
 * 所以在多线程环境下不可使用这种方式
 * 3)	结论：在实际开发中，不要使用这种方式.
 *
 * @author liuzhixiang 2020/07/24 23:14
 */
public class SingletonLazyLoading {
    private static SingletonLazyLoading instance;

    private SingletonLazyLoading() {}

    /**
     * <p>
     * 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
     * [即懒汉式]
     * </p>
     * 
     * @author liuzhixiang 2020/07/24 23:15
     */
    public static SingletonLazyLoading getInstance() { 
        if (instance == null) 
        {
            instance = new SingletonLazyLoading();
        }
        return instance;
    }

}

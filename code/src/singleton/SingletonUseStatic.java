package singleton;

/**
 * description
 *
 * 1)	这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，
 *      也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
 * 2)	结论：这种单例模式可用，但是可能造成内存浪费
 *
 * @author liuzhixiang 2020/07/14 21:51
 */
public class SingletonUseStatic {
    //1. 构造器私有化,  外部能 new
    private SingletonUseStatic() {

    }

    private	static SingletonUseStatic instance;

    static { // 在静态代码块中，创建单例对象
        instance = new SingletonUseStatic();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static SingletonUseStatic getInstance() { return instance;
    }

}

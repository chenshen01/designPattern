package proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * description 动态代理JDK代理
 *
 * @author liuzhixiang 2020/08/10 11:08
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        IStudentDao studentDao = new StudentDao();
        /**
         *  注意Proxy.newProxyInstance()方法接受三个参数：
         *
         * ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
         * Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
         * InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
         */
        IStudentDao iStudentDao = (IStudentDao)Proxy.newProxyInstance(IStudentDao.class.getClassLoader(),
                new Class[]{IStudentDao.class},new DynamicProxyHandler(studentDao));
        iStudentDao.study();;
    }
}

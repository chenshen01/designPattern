package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * description JDK代理--动态处理器
 *
 * @author liuzhixiang 2020/08/10 11:09
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object target;

    public DynamicProxyHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----开始------");
        Object result = method.invoke(target, args);
        System.out.println("-----结束------");
        return null;
    }
}

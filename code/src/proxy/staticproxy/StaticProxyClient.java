package proxy.staticproxy;

/**
 * description 静态代理
 *
 * 静态代理总结：
 *
 * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 *
 * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
 *
 * @author liuzhixiang 2020/08/10 10:55
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        StudentDaoProxy proxy = new StudentDaoProxy(new StudentDao());
        proxy.study();
    }
}

package decorator;

/**
 * description 装饰器模式是代替增加子类的一种解决方案
 * 体现了聚合/合成复用原则的思想，尽量使用组合的方式来扩展功能，
 * 这样就把基本功能和扩展功能解耦了，使得代码可复用，可维护，灵活。
 * 关键点在于装饰器模式可以动态地为对象增加扩展功能。
 *
 * 1)	装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，
 * 装饰者模式也体现了开闭原则(ocp)
 * 2)	这里提到的动态的将新功能附加到对象和 ocp 原则，
 * 在后面的应用实例上会以代码的形式体现，请同学们注意体会。
 *
 * @see https://www.cnblogs.com/yxlaisj/p/10446504.html
 * @see https://www.cnblogs.com/zhuhongchang/p/7617988.html
 * @author liuzhixiang 2020/08/03 22:29
 */
public class SimpleCoffee implements Coffee {

    @Override
    public void cost() {
        int cost = 1;
        System.out.println("原味咖啡花了:" + cost);
    }
}

package template;

/**
 * description 模板模式
 * 1、概念
 *
 * 它定义一个操作中的算法的框架，而将一些步骤延迟到了子类中。
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些步骤。
 *
 * 2、优缺点
 *
 * 先说一下他的优点吧：
 *
 * （1）把不可改变的封装起来，把能够改变的扩展开来
 *
 * （2）他把很多类的共同操作给封装了起来，利于维护
 *
 * （3）其实我们发现，我们在定义行为时候都是由父类去定义，然后子类去实现即可。
 *
 * 再聊一下他的缺点：
 *
 * 缺点很简单，我们发现虽然我们把一些类的共同操作封装了起来，但是当这些类比较多时，
 * 效果就不好了，因为有一个拓展子类都需要继承它，子类多了就不好了。
 *
 * @author liuzhixiang 2020/08/10 16:15
 */
public class TemplateClient {
    public static void main(String[] args) {
        CookerCoo cookerCoo = new CookerCoo();
        cookerCoo.make();
    }
}

package composite;

/**
 * description  组合模式
 *• 组合模式的安全性是指：从客户使用组合模式上看是否更安全。如果是安全的，
 * 那么就不会有发生误操作的可能，能访问的方法都是被支持的功能。
 * • 组合模式的透明性是指：从客户使用组合模式上看是否需要区分到底是组合对象还是叶子对象。
 * 如果是透明的，那就不用再区分，对于客户而言，都是组件对象，具体的类型对于客户而言是透明的，
 * 是客户无须关心的。
 *
 * 透明性的实现：
 * 如果把管理子组件的操作定义在Component中，那么客户端只需要面对Component，而无须关心具体的组件类型，
 * 这种实现方式就是透明性的实现。前面结构示意代码中就是采用的这一实现方式。
 * 但是透明性的实现是以安全性为代价的，因为在Component中定义的一些方法，
 * 对于叶子对象来说是没有意义的，比如增加、删除子组件对象。但这些方法对客户却是透明的，
 * 因此客户可能会对叶子对象调用这种增加或删除子组件的方法，这样的操作是不安全的。
 * 组合模式的透明性实现，通常的方式是：在Component中声明管理子组件的操作，
 * 并在Component中为这些方法提供默认的实现，对于叶子对象不支持的功能，
 * 可以直接抛出一个异常，来表示不支持这个功能。
 *
 * 两种实现方式的选择：
 * 对于组合模式而言，在安全性和透明性上，会更看重透明性，毕竟组合模式的功能就是要让用户对叶子对象和组合对象的使用具有一致性。
 * 因此，在使用组合模式的时候，应多采用透明性的实现方式，少用安全性的实现方式
 *
 * @see https://blog.csdn.net/jiangtianjiao/article/details/87977312
 * @author liuzhixiang 2020/08/04 12:34
 */
public class CompositeClient {
    public static void main(String[] args) {
        // 定义多个Composite组合对象
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");
        Component c3 = new Composite("母婴");

        // 定义多个Leaf叶子对象
        Component leaf1 = new Leaf("西服");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("衬衫");
        Component leaf4 = new Leaf("裙子");
        Component leaf5 = new Leaf("套装");
        Component leaf6 = new Leaf("鞋袜");
        Component leaf7 = new Leaf("孕妇装");
        Component leaf8 = new Leaf("婴儿装");

        // 组合成为树形的对象结构
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf6);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c1.addChild(leaf3);
        c2.addChild(leaf4);
        c2.addChild(leaf5);
        c2.addChild(c3);
        c3.addChild(leaf7);
        c3.addChild(leaf8);

        // 调用根对象的输出功能输出整棵树
        root.someOperation("");

    }
}

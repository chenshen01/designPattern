package adaptor;

/**
 * description  【类适配器】 继承的关系
 * 1)	Java 是单继承机制，所以类适配器需要继承 src 类这一点算是一个缺点, 因为这要求 dst 必须是接口，有一定局限性;
 * 2)	src 类的方法在 Adapter 中都会暴露出来，也增加了使用的成本。
 * 3)	由于其继承了 src 类，所以它可以根据需求重写 src 类的方法，使得 Adapter 的灵活性增强了。
 * @author liuzhixiang 2020/07/26 20:26
 */
public class VoltageAdaptor extends Voltage220V implements IVoltage5V {

    /**
     * 【对象适配器】
     *1)对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。
     * 根据合成复用原则，使用组合替代继承， 所以它解决了类适配器必须继承
     * src 的局限性问题，也不再要求 dst必须是接口。
     *
     * 2)使用成本更低，更灵活。
     */
    // private Voltage220V voltage220V;

    @Override
    public int output5V() {
        int src = this.output220V();
        int des = src / 44;
        return des;
    }
}

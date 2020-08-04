package flyweight;

/**
 * description 享元模式
 *
 *   ● Flyweight（抽象享元类）：通常是一个接口或抽象类，在抽象享元类中
 *   声明了具体享元类公共的方法，这些方法可以向外界提供享元对象的内部数据（内部状态），
 *   同时也可以通过这些方法来设置外部数据（外部状态）。
 *
 *   ● ConcreteFlyweight（具体享元类）：它实现了抽象享元类，其实例称为享元对象；
 *   在具体享元类中为内部状态提供了存储空间。通常我们可以结合单例模式来设计具体享元类，
 *   为每一个具体享元类提供唯一的享元对象。
 *
 *   ● UnsharedConcreteFlyweight（非共享具体享元类）：并不是所有的抽象享元类的子类都需要被共享，
 *   不能被共享的子类可设计为非共享具体享元类；当需要一个非共享具体享元类的对象时可以直接通过实例化创建。
 *
 *   ● FlyweightFactory（享元工厂类）：享元工厂类用于创建并管理享元对象，它针对抽象享元类编程，
 *   将各种类型的具体享元对象存储在一个享元池中，享元池一般设计为一个存储“键值对”的集合（也可以是其他类型的集合），
 *   可以结合工厂模式进行设计；当用户请求一个具体享元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建一个新的实例
 *   （如果不存在的话），返回新创建的实例并将其存储在享元池中。
 *
 * @see https://www.cnblogs.com/lfxiao/p/6817141.html
 * @author liuzhixiang 2020/08/04 21:50
 */
public class FlyweightClient {
    public static void main(String[] args) {
        IgoChessmanFactory instance = IgoChessmanFactory.getInstance();
        IgoChessman black = instance.getIgoChessman("black");
        black.display();
        black.displayCoordinates(new Coordinates(2,3));
    }
}

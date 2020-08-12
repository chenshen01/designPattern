package command.simplecommand;

/**
 * description  命令模式
 * 命令模式的优点
 * 　　●　　更松散的耦合
 *
 * 　　命令模式使得发起命令的对象——客户端，和具体实现命令的对象——接收者对象完全解耦，
 *    也就是说发起命令的对象完全不知道具体实现对象是谁，也不知道如何实现。
 *
 * 　　●　　更动态的控制
 *
 * 　　命令模式把请求封装起来，可以动态地对它进行参数化、队列化和日志化等操作，
 *    从而使得系统更灵活。
 *
 * 　　●　　很自然的复合命令
 *
 * 　　命令模式中的命令对象能够很容易地组合成复合命令，也就是宏命令，
 *    从而使系统操作更简单，功能更强大。
 *
 * 　　●　　更好的扩展性
 *
 * 　　由于发起命令的对象和具体的实现完全解耦，因此扩展新的命令就很容易，
 *    只需要实现新的命令对象，然后在装配的时候，把具体的实现对象设置到命令对象中，
 *    然后就可以使用这个命令对象，已有的实现完全不用变化。
 *
 *
 * @see https://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html
 * @author liuzhixiang 2020/08/12 11:19
 */
public class CommandClient {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}

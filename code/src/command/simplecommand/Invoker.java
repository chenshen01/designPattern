package command.simplecommand;

/**
 * description 请求者角色类
 * 负责调用命令对象执行请求，相关的方法叫做行动方法。
 *
 * @author liuzhixiang 2020/08/12 11:27
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;

    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action(){
        command.execute();
    }
}

package command.simplecommand;

/**
 * description 抽象命令角色类
 *  声明了一个给所有具体命令类的抽象接口。
 *
 * @author liuzhixiang 2020/08/12 11:25
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();
}

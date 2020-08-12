package command.comandplayer;

/**
 * description 　系统需要一个代表宏命令的接口，以定义出具体宏命令所需要的接口。
 * 宏命令:多个命令
 * @author liuzhixiang 2020/08/12 12:04
 */
public interface MacroCommand extends Command{
    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    void add(Command command);

    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    void remove(Command cmd);
}

package command.comandplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * description  宏命令的具体实现
 *
 * @author liuzhixiang 2020/08/12 12:05
 */
public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList = new ArrayList<>();
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        if (commandList != null && !commandList.isEmpty() && commandList.contains(command)) {
            commandList.remove(command);
        }
    }

    @Override
    public void execute() {
        if (commandList != null && !commandList.isEmpty()) {
            commandList.forEach( command -> {
                command.execute();
            });
        }
    }
}

package command.comandplayer;

/**
 * description 使用者
 *
 * @author liuzhixiang 2020/08/12 11:39
 */
public class PlayerClient {
    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new StartCommand(audioPlayer);
        Command rewindCommand = new ReviewCommend(audioPlayer);
        Command stopCommand = new PoseCommend(audioPlayer);
        //创建请求者对象
        Keypad keypad = new Keypad(playCommand,rewindCommand,stopCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();

        // 测试宏命令
        MacroAudioCommand audioCommand = new MacroAudioCommand();
        audioCommand.add(playCommand);
        audioCommand.add(rewindCommand);
        audioCommand.add(stopCommand);
        audioCommand.execute();
    }
}

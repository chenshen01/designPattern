package command.comandplayer;

/**
 * description 开始命令
 *
 * @author liuzhixiang 2020/08/12 11:43
 */
public class StartCommand implements Command {
    private AudioPlayer audioPlayer;

    public StartCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        audioPlayer.star();
    }
}

package command.comandplayer;

/**
 * description 暂停命令
 *
 * @author liuzhixiang 2020/08/12 11:43
 */
public class PoseCommend implements Command {
    private AudioPlayer audioPlayer;

    public PoseCommend(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        audioPlayer.pose();
    }
}

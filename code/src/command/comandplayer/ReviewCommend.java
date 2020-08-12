package command.comandplayer;

/**
 * description  倒带命令
 *
 * @author liuzhixiang 2020/08/12 11:43
 */
public class ReviewCommend implements Command {
    private AudioPlayer audioPlayer;

    public ReviewCommend(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        audioPlayer.review();
    }
}

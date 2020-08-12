package command.comandplayer;

/**
 * description 键盘（请求者）
 *
 * @author liuzhixiang 2020/08/12 11:47
 */
public class Keypad {
    private Command startCommand;
    private Command poseCommand;
    private Command reviewCommand;

    public Keypad(){

    }

    public Keypad(Command startCommand,Command poseCommand,Command reviewCommand){
        this.poseCommand = poseCommand;
        this.reviewCommand = reviewCommand;
        this.startCommand = startCommand;
    }

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setPoseCommand(Command poseCommand) {
        this.poseCommand = poseCommand;
    }

    public void setReviewCommand(Command reviewCommand) {
        this.reviewCommand = reviewCommand;
    }

    /**
     * 执行播放方法
     */
    public void play(){
        startCommand.execute();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        reviewCommand.execute();
    }
    /**
     * 执行暂停方法
     */
    public void stop(){
        poseCommand.execute();
    }
}

package brige;

/**
 * description
 *
 * @author liuzhixiang 2020/07/26 21:19
 */
public class MacComputer extends Computer{
    @Override
    public void sell(){
        super.sell();
        System.out.println("笔记本");
    }
}

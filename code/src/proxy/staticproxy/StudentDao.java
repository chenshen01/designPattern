package proxy.staticproxy;

/**
 * description 委托类
 *
 * @author liuzhixiang 2020/08/10 10:56
 */
public class StudentDao implements IStudentDao{
    @Override
    public void study() {
        System.out.println("    学习   ");
    }
}

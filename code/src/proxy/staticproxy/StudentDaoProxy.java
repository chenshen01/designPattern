package proxy.staticproxy;

/**
 * description 代理类
 *
 * @author liuzhixiang 2020/08/10 10:57
 */
public class StudentDaoProxy implements IStudentDao{

    private IStudentDao studentDao;

    public StudentDaoProxy(IStudentDao studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public void study() {
        System.out.println("-----开始------");
        studentDao.study();
        System.out.println("-----结束------");
    }
}

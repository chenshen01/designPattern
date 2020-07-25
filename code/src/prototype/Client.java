package prototype;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:31
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Student student = new Student();
        Student friend = new Student();
        student.setStudent(friend);
        Student clone = (Student)student.deepClone();
        System.out.println(student.getStudent().toString());
        System.out.println(clone.getStudent().toString());
    }
}

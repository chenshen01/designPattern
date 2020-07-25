package prototype;

import java.io.*;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 9:29
 */
public class Student implements Serializable,Cloneable {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * <p>
     * 深拷贝
     * 深拷贝 - 方式 2 通过对象的序列化实现 (推荐)
     * </p>
     *
     * @author liuzhixiang 2020/07/25 9:49
     */
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Student copyObj = (Student)ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

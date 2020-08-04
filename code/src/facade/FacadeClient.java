package facade;

/**
 * description
 *
 * @author liuzhixiang 2020/08/04 21:05
 */
public class FacadeClient {
    public static void main(String[] args) {
        FacadeImpl facade = new FacadeImpl();
        facade.methodA();
        facade.methodB();
    }
}

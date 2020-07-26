package adaptor;

/**
 * description
 *
 * @author liuzhixiang 2020/07/26 20:29
 */
public class Cilent {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdaptor adaptor = new VoltageAdaptor();
        phone.charge(adaptor);
    }
}

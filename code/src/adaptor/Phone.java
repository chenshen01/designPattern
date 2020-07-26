package adaptor;

/**
 * description
 *
 * @author liuzhixiang 2020/07/26 20:29
 */
public class Phone {
    public void charge(IVoltage5V voltage5V){
        if (voltage5V.output5V() == 5) {
            System.out.println("手机充电成功");
        } else {
            System.out.println("电压不稳定");
        }
    }
}

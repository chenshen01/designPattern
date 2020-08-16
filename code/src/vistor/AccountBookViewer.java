package vistor;

/**
 * description  账单查看者接口（相当于Visitor）
 *
 * @author liuzhixiang 2020/08/12 23:00
 */
public interface AccountBookViewer {
    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
     void view(IncomeBill bill);
}

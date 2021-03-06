package vistor;

/**
 * description 收入的单子
 *
 * @author liuzhixiang 2020/08/12 23:01
 */
public class IncomeBill implements Bill{

    /**
     * 金额
     */
    private double amount;

    /**
     * 项目
     */
    private String item;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }
}

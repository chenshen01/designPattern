package vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * description 账本类
 * 它是当前访问者模式例子中的对象结构
 *
 * 账本类当中有一个列表，这个列表是元素（Bill）的集合，这便是对象结构的通常表示，
 * 它一般会是一堆元素的集合，不过这个集合不一定是列表，也可能是树，链表等等任何数
 * 据结构，甚至是若干个数据结构。其中show方法，就是账本类的精髓，它会枚举每一个
 * 元素，让访问者访问。
 *
 * @author liuzhixiang 2020/08/16 12:56
 */
public class AccountBook {
    /**
     * 单子列表
     */
    private List<Bill> billList = new ArrayList<Bill>();

    /**
     * 添加单子
     *
     * @param bill
     * @author liuzhixiang 2020-08-16 12:57
     * @return
     */
    public void addBill(Bill bill){
        billList.add(bill);
    }

    //供账本的查看者查看账本
    public void show(AccountBookViewer viewer){
        if (!billList.isEmpty()) {
            billList.forEach(bill -> {
                bill.accept(viewer);
            });
        }
    }
}

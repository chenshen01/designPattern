package vistor;

/**
 * description 单子
 *
 * 单个单子的接口（相当于Element）
 *
 * @author liuzhixiang 2020/08/12 22:10
 */
public interface Bill {
    void accept(AccountBookViewer viewer);
}

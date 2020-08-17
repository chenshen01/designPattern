package iterator;

import java.util.Iterator;

/**
 * description 抽象容器
 *
 * @author liuzhixiang 2020/08/17 20:40
 */
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();
}

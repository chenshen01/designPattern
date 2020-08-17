package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * description  具体容器
 *
 * @author liuzhixiang 2020/08/17 21:07
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(list);
    }
}

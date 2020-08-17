package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * description 具体的迭代器，完成容器的遍历
 *
 * @author liuzhixiang 2020/08/17 20:23
 */
public class MyIterator implements Iterator<Object> {

    private List<Object> list;

    private int index = 0;

    public MyIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (this.index < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.index < list.size()) {
            Object result = list.get(index);
            index++;
            return result;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove(int index) {
        if (this.index < list.size()) {
           list.remove(index);
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove(Object element) {
        list.remove(element);
    }
}

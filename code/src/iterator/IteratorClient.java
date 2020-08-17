package iterator;

import java.util.Iterator;

/**
 * description 迭代器模式
 *
 * @see https://blog.csdn.net/uftjtt/article/details/79623011
 *
 * @author liuzhixiang 2020/08/17 20:23
 */
public class IteratorClient {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("liu");
        aggregate.add("zhi");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

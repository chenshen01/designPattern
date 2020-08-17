package observer;

import java.util.Observer;

/**
 * description  主题
 *
 * @author liuzhixiang 2020/08/17 22:26
 */
public interface Subject {
    /**
     * 观察者注册
     * @param observer
     */
    void registerObserver(IObserver observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(IObserver observer);

    /**
     * 当主题有内容更新时调用，用于通知观察者
     */
    void notifyObserver();
}

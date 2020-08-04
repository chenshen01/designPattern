package flyweight;

import utils.StringUtils;

import java.util.HashMap;

/**
 * description 围棋棋子工厂类：享元工厂类，使用单例模式进行设计
 *
 * @author liuzhixiang 2020/08/04 22:01
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static HashMap<String,IgoChessman> chessCache = new HashMap<>();

    private static final String WHITE = "white";
    private static final String BLACK = "black";

    /**
     * 返回享元工厂类的唯一实例
     */
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    private IgoChessmanFactory(){

    }

    public IgoChessman getIgoChessman(String color){
        if (StringUtils.isNotNull(color)) {
            if (WHITE.equals(color)) {
                if (chessCache.get(color) == null) {
                    chessCache.put(color,new WhiteIgoChessman());
                    return chessCache.get(color);
                }
                return chessCache.get(color);
            } else if (BLACK.equals(color)) {
                if (chessCache.get(color) == null) {
                    chessCache.put(color,new BlackIgoChessman());
                    return chessCache.get(color);
                }
                return chessCache.get(color);
            } else {
                throw new RuntimeException("不是合法的棋子颜色");
            }
        }
        return null;
    }

    public void removeIgoChessman(String color){
        if (StringUtils.isNotNull(color)) {
            if (chessCache.containsKey(color)) {
                chessCache.remove(color);
                System.out.println("删除共享对象：" + color + "成功");
            }
            System.out.println("该共享对象：" + color + "不存在");
        }
    }

}

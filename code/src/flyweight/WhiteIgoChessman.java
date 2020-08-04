package flyweight;

/**
 * description 白色棋子类：具体享元类
 *
 * @author liuzhixiang 2020/08/04 22:00
 */
public class WhiteIgoChessman extends IgoChessman {

    @Override
    public String getColor() {
        return "白色";
    }
}

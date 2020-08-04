package flyweight;

/**
 * description  外部状态 棋子的位置
 *
 * @author liuzhixiang 2020/08/04 21:50
 */
public class Coordinates {
    private int x;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

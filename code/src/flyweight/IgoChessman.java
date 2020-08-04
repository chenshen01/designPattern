package flyweight;

/**
 * description 围棋棋子类：抽象享元类
 *
 * @author liuzhixiang 2020/08/04 21:55
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }

    public void displayCoordinates(Coordinates coordinates){
        System.out.println("棋子的位置：(" + coordinates.getX() + "," + coordinates.getY() + ")");
    }
}

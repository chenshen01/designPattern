package builder;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 10:07
 */
public class Director {
    private HouseBuilder houseBuilder;
    public Director(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public House build(){
        return this.houseBuilder.buildHouse();
    }
}

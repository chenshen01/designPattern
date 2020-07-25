package builder;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 10:06
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public House buildHouse() {
        house.setName("HighHouse");
        System.out.println("build:" + house.getName());
        return this.house;
    }
}

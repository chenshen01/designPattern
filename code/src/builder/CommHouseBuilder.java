package builder;

/**
 * description
 *
 * @author liuzhixiang 2020/07/25 10:03
 */
public class CommHouseBuilder extends HouseBuilder{
    @Override
    public House buildHouse() {
        house.setName("CommHouse");
        System.out.println("build:" + house.getName());
        return this.house;
    }
}

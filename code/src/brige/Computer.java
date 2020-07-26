package brige;

/**
 * description
 *
 * @author liuzhixiang 2020/07/26 21:13
 */
public class Computer {
    private Brand brand;
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    protected void sell(){
        brand.sell();
    }
}

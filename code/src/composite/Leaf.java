package composite;

/**
 * description 叶子节点
 *
 * @author liuzhixiang 2020/08/04 12:45
 */
public class Leaf extends Component {
    /**
     * 示意属性，组件的名字
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void someOperation(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}

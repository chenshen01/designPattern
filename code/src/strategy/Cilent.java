package strategy;

/**
 * description 策略模式
 *
 * @author liuzhixiang 2021/02/20 16:34
 */
public class Cilent {
    public static void main(String[] args) {
        StrategyEnum strategyEnum = StrategyEnum.valueOf("FAST");
        StrategyEnum.FAST.run();
        strategyEnum.run();
    }
}

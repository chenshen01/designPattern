package strategy;

/**
 * description
 *
 * @author liuzhixiang 2021/02/20 16:34
 */
public enum StrategyEnum {

    /**
     * <p>
     * 执行
     * </p>
     *
     * @author liuzhixiang 2021/02/20 16:43
     */
    FAST {
        @Override
        void run() {
            //do something
            System.out.println("FAST");
        }
    },
    NORMAL {
        @Override
        void run() {
            //do something
        }
    },

    SMOOTH {
        @Override
        void run() {
            //do something
        }
    },

    SLOW {
        @Override
        void run() {
            //do something
        }
    };
    abstract void run();

}

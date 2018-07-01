package chapter_04;

/**
 * 相亲
 *
 * @author biezhi
 * @date 2018/6/27
 */
public class Example2 {

    public static final int MIN_DEPOSIT = 100_000;

    private int searchDeposit(String userName) {
        return 2000;
    }

    public void invoke() {
        if (searchDeposit("os7blue") < MIN_DEPOSIT) {
            System.out.println("您预约的妹子已下线");
        }
    }

}

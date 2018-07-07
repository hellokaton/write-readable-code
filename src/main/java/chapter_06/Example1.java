package chapter_06;

import java.util.Arrays;

/**
 * 什么不需要注释
 *
 * @author biezhi
 * @date 2018/7/6
 */
public class Example1 {

    // 定义了一个账户类
    static class Account {

        // 构造器
        public Account() {
        }

        // 将利润设置为一个新值
        void setPorfit(double profit) {

        }

        // 返回账户的利润
        double getProfit() {
            return 2.9D;
        }

    }

    public void foo() {
        String line = "hello:world:2018";

        // 删除第二个 ":" 之后的元素
        String[] newLines = Arrays.copyOfRange(line.split(":"), 0, 2);
        String   name     = String.join(":", newLines);
    }

}

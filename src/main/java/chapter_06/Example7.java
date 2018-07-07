package chapter_06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 总结性注释
 *
 * @author biezhi
 * @date 2018/7/6
 */
public class Example7 {

    private List<Long>            customers = Arrays.asList(1L, 3L, 45L, 62L, 98L);
    private Map<Long, List<Sale>> allSales  = new HashMap<>();

    static class Sale {

        Long recipient;
    }

    public void foo() {
        for (Long customerId: customers) {
            for (Sale sale: allSales.get(customerId)) {
                if (sale.recipient.equals(customerId)) {
                    // do something
                }
            }
        }
    }

    public void generateUserReport() {
        // 获取当前用户的锁
        // .... 省略一部分代码

        // 从数据库中读取用户的信息
        // .... 省略一部分代码

        // 将信息写入到文件
        // .... 省略一部分代码

        // 释放当前用户的锁
    }

}

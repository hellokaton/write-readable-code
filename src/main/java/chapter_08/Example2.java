package chapter_08;

import java.util.Arrays;
import java.util.List;

/**
 * if else 块的顺序
 *
 * @author biezhi
 * @date 2018/7/11
 */
public class Example2 {

    boolean a, b;

    public void part1() {
        if (a == b) {
            System.out.println("有钱人");
        } else {
            System.out.println("没钱的肥宅");
        }
    }

    class Request {
        boolean hasParam(String key) {
            return false;
        }
    }

    class Response {
        void writeJSON(Object bean) {

        }
    }

    public void part2(Request request, Response response) {

        List<String> items = Arrays.asList("hello", "world");

        if (!request.hasParam("biezhi")) {
            response.writeJSON(items);
        } else {
            for (String item: items) {
                // TODO
            }
        }
    }

}

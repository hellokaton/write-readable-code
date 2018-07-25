package chapter_10;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.BiConsumer;

/**
 * 减少变量
 *
 * @author biezhi
 * @date 2018/7/21
 */
public class Example1 {

    class Message {
        LocalDateTime lastViewTime;
    }

    public void part1(Message rootMessage) {
        LocalDateTime now = LocalDateTime.now();
        rootMessage.lastViewTime = now;
    }


    public void part2() {
        BiConsumer<List<Integer>, Integer> consumer = (array, valueToRemove) -> {
            Integer indexToRemove = null;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).equals(valueToRemove)) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != null) {
                array.remove(indexToRemove);
            }
        };
    }

}

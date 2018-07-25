package chapter_10;

/**
 * 减少控制流变量
 *
 * @author biezhi
 * @date 2018/7/25
 */
public class Example2 {

    int foo = 10;
    int bar = 20;

    public void part1() {
        boolean done = false;

        while (foo < bar && !done) {
            foo++;
            if (foo > bar) {
                done = true;
                continue;
            }
        }
    }

}

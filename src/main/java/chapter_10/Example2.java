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
        while (foo < bar) {
            if(!isDone()){
                break;
            }
            foo++;
            if (foo > bar) {
                continue;
            }
        }
    }

    private boolean isDone(){
        return false;
    }
}

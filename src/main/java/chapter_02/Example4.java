package chapter_02;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example4 {

    private int hash;
    private int c = 2018;

    public void calcHash() {
        // Fast version of "hash = (65599 * hash) + c"
        hash = (hash << 6) + (hash << 16) - hash + c;
    }

}

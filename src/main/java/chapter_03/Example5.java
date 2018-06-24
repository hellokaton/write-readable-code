package chapter_03;

/**
 * 用具体的名字代替抽象的名字
 *
 * @author biezhi
 * @date 2018/6/24
 */
public class Example5 {

    public void start() {
        String runLocally = System.getProperty("--runLocally", "false");

    }

    public static void main(String[] args) {
        new Example5().start();
    }

}

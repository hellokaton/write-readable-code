package chapter_03;

import java.util.Arrays;
import java.util.List;

/**
 * 用前缀或后缀表达含义
 *
 * @author biezhi
 * @date 2018/6/24
 */
public class Example4 {

    private static final int          DEFAULT_PORT    = 9000;
    private static final List<String> DEFAULT_STATICS = Arrays.asList("/static", "/upload");

    // bad
    private String id = "af84ef845cd8";
    private String hexId = "af84ef845cd8";

    public void calcTime() {
        long startMs = System.currentTimeMillis();
        // do something
        long elapsed = System.currentTimeMillis() - startMs;
        System.out.println("耗时: " + elapsed + "ms");
    }

}

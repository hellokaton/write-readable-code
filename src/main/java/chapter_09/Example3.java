package chapter_09;

/**
 * 使用德摩根定理
 * 滥用短路逻辑
 *
 * @author biezhi
 * @date 2018/7/14
 */
public class Example3 {

    /**
     * 1) not (a or b or c) <=> (not a) and (not b) and (not c)
     * 2) not (a and b and c) <=> (not a) or (not b) or (not c)
     */
    public void part1(boolean fileExists, boolean isProtected) {
        if (!(fileExists && !isProtected)) {
            throw new RuntimeException("对不起，无法读取该文件");
        }
    }


    public void part2() {
        // assert((!(bucket = findBucket(key)) && bucket->isOccupied()))
    }

}

package chapter_09;

/**
 * 与复杂的逻辑斗争
 *
 * @author biezhi
 * @date 2018/7/14
 */
public class Example4 {

    class Range{
        int begin;
        int end;

        // 如：(0, 5) 会和 (3, 8) 重合
        // (0, 2) (2,4)
        boolean overlapsWith(Range other){
            // 检查自己的任意端点是否在 other 的范围之内
//            return (begin >= other.begin && begin <= other.end) ||
//                (end >= other.begin && end <= other.end);
//            return (begin >= other.begin && begin < other.end) ||
//                (end > other.begin && end <= other.end) ||
//                (begin <= other.begin && end >= other.end);
            if(other.end <= begin) return false;
            if(other.begin >= end) return false;
            return true;
        }
    }



}

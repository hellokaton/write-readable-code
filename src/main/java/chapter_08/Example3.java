package chapter_08;

/**
 * 三目运算符
 *
 * @author biezhi
 * @date 2018/7/11
 */
public class Example3 {

    int hour;

    public void part1() {
        String timeString = (hour >= 12) ? "pm" : "am";
    }

    public int part2() {
        int exponent = 20; // 计算出来的值
        int mantissa = -1; // 为了演示写死了
        return exponent >= 0 ? mantissa * (1 << exponent) : mantissa / (1 << exponent);
    }

}

package chapter_08;

/**
 * 条件语句中参数的顺序
 *
 * @author biezhi
 * @date 2018/7/11
 */
public class Example1 {

    int  length = 2018;
    long bytesReceived;
    long bytesExpected;

    public void part1() {
        if (length >= 2000) {
            System.out.println("你是一个现代程序员");
        }
    }

    public void part2() {
        if (2000 <= length) {
            System.out.println("你是一个现代程序员??");
        }
    }

    public void part3() {
        while (bytesReceived < bytesExpected) {
            System.out.println("请继续接收");
        }
    }

    public void part4() {
        while (bytesExpected > bytesReceived) {
            System.out.println("请继续接收");
        }
    }

}

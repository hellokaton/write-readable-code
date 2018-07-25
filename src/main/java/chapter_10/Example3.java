package chapter_10;

/**
 * 缩小变量的作用域
 *
 * @author biezhi
 * @date 2018/7/25
 */
public class Example3 {

    String username;

    public void buildName() {
        username = "abc";
    }

    public boolean checkName() {
        return null != username && username.length() > 6;
    }

}

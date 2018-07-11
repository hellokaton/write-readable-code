package chapter_08;

/**
 * 在方法/函数中提前返回
 * 最小化嵌套
 *
 * @author biezhi
 * @date 2018/7/11
 */
public class Example5 {

    public boolean contains(String str, String subString) {
        if (str == null || subString == null) {
            return false;
        }
        if (subString.equals("")) {
            return true;
        }
        return str.indexOf(subString) != -1;
    }

    final int SUCCESS = 200;

    public void part1() {
        int userResult       = 200;
        int permissionResult = 300;

        String message = "";
        if (userResult == SUCCESS) {
            if (permissionResult != SUCCESS) {
                message = "没有权限阅读";
                return;
            }
            message = "";
        } else {
            message = String.valueOf(userResult);
        }
        // 模拟使用 message
        System.out.println(message);
    }

}

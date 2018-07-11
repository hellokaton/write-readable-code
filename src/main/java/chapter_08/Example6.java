package chapter_08;

import java.util.Arrays;
import java.util.List;

/**
 * 减少循环嵌套
 *
 * @author biezhi
 * @date 2018/7/11
 */
public class Example6 {

    class User {
        String name;

        public User(String name) {
            this.name = name;
        }
    }

//    public void foo() {
//        List<User> result = Arrays.asList(new User("jack"),
//                new User("biezhi"));
//
//        int notNullCount = 0;
//        for (User user: result) {
//            if (user != null) {
//                notNullCount++;
//                if (user.name != null) {
//                    System.out.println(user.name);
//                }
//            }
//        }
//
//    }

    public void bar() {
        List<User> result = Arrays.asList(new User("jack"),
                new User("biezhi"));

        int notNullCount = 0;
        for (User user : result) {
            if (null == user) {
                continue;
            }
            notNullCount++;
            if (user.name != null) {
                System.out.println(user.name);
            }
        }

    }

}

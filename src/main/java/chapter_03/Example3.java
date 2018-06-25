package chapter_03;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环迭代器
 * <p>
 * 用具体的名字代替抽象的名字
 *
 * @author biezhi
 * @date 2018/6/24
 */
public class Example3 {

    static class Club {

        public List<String> members() {
            return new ArrayList<>();
        }
    }

    public void before() {
//        List<String> users = new ArrayList<>();
//        List<Club>   clubs = new ArrayList<>();
//
//        for (int i = 0; i < clubs.size(); i++) {
//            for (int j = 0; j < clubs.get(0).members().size(); j++) {
//                for (int k = 0; k < users.size(); k++) {
//                    if (clubs.get(i).members().get(k) == users.get(j)) {
//                        System.out.println("用户 [" + j + "] 在俱乐部 [" + i + "]");
//                    }
//                }
//            }
//        }

    }

    public void after() {
        List<String> users = new ArrayList<>();
        List<Club>   clubs = new ArrayList<>();

        for (int ci = 0; ci < clubs.size(); ci++) {
            for (int mi = 0; mi < clubs.get(0).members().size(); mi++) {
                for (int ui = 0; ui < users.size(); ui++) {
                    if (clubs.get(ci).members().get(mi) == users.get(ui)) {
                        System.out.println("用户 [" + mi + "] 在俱乐部 [" + ci + "]");
                    }
                }
            }
        }
    }

}

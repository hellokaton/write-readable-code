package chapter_03;

import java.util.ArrayList;
import java.util.List;

/**
 * @author biezhi
 * @date 2018/6/24
 */
public class Example3 {

    static class Club {

        public List<String> memebers() {
            return new ArrayList<>();
        }
    }

    public void before() {
        List<String> users = new ArrayList<>();
        List<Club>   clubs = new ArrayList<>();

        for (int i = 0; i < clubs.size(); i++) {
            for (int j = 0; j < clubs.get(0).memebers().size(); j++) {
                for (int k = 0; k < users.size(); k++) {
                    if (clubs.get(i).memebers().get(k) == users.get(j)) {
                        System.out.println("用户 [" + j + "] 在俱乐部 [" + i + "]");
                    }
                }
            }
        }

    }

    public void after() {
        // TODO
    }

}

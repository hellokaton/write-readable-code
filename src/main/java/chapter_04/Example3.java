package chapter_04;

import java.util.ArrayList;
import java.util.List;

/**
 * 范围
 *
 * @author biezhi
 * @date 2018/6/27
 */
public class Example3 {

    private List<Integer> ageRange(int start, int stop) {
        List<Integer> list = new ArrayList<>(stop - start);
        for (int i = start; i < stop; i++) {
            list.add(i);
        }
        return list;
    }

    public void invoke() {
        List<Integer> range = ageRange(20, 30);
        System.out.println(range);
    }

}

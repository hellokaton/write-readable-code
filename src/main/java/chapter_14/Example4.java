package chapter_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * 熟悉标准库
 *
 * @author biezhi
 * @date 2018/9/24
 */
public class Example4 {

    private List<Integer> list = Arrays.asList(2, 3, 3, 3);

//    public List<Integer> unique(List<Integer> elements) {
//        List<Integer> result = new ArrayList<>();
//        for (Integer element : elements) {
//            if (!result.contains(element)) {
//                result.add(element);
//            }
//        }
//        return result;
//    }

//    public List<Integer> unique(List<Integer> elements) {
//        return new ArrayList<>(new HashSet<>(elements));
//    }

    public List<Integer> unique(List<Integer> elements) {
        return elements.stream().distinct().collect(toList());
    }
}

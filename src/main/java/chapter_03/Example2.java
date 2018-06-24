package chapter_03;

import java.util.function.Function;

/**
 * 避免tmp和retval这样泛泛的名字
 *
 * @author biezhi
 * @date 2018/6/24
 */
public class Example2 {

    public void before() {
        Function<int[], Double> euclideanNorm = v -> {
            double retval = 0;
            for (int i = 0; i < v.length; i++)
                retval += v[i] * v[i];
            return Math.sqrt(retval);
        };

        int[]  numbs = {1, 2, 3, 5};
        Double apply = euclideanNorm.apply(numbs);
        System.out.println(apply);
    }

    public void after() {
        // TODO
    }

    
}

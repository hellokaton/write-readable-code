package chapter_05;

import java.util.List;

/**
 * 为什么审美是重要的
 *
 * @author biezhi
 * @date 2018/7/3
 */
public class Example1 {

    static abstract class StatsKeeper1 {
    // A class for keeping track of a series of doubles
        abstract void add(double d); // and methods for quick statistics about them
      private int count;    /* how many so    far
    */ public abstract double avgerage();
    private double minimum;
        private List<Double> pastItems
                ; double maximum;

    }

    // A class for keeping track of a series of doubles
    // and methods for quick statistics about them
    static abstract class StatsKeeper2 {

        abstract void add(double d);
        abstract double avgerage();

        private List<Double> pastItems;
        private int count;    // how many so    far

        private double minimum;
        private double maximum;

    }

}

package katas.kyu7;

import java.util.Collections;
import java.util.TreeSet;

public class SpeedControl {
    public static int gps(int s, double[] x) {
        TreeSet<Double> answerSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = x.length - 1; i > 0; i--) {
            answerSet.add((3600 * (x[i] - x[i - 1])) / s);
        }
        return answerSet.size() > 0 ? answerSet.first().intValue() : 0;
    }
}

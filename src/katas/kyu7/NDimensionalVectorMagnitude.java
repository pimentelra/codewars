package katas.kyu7;

import java.util.Arrays;

public class NDimensionalVectorMagnitude {
    public static double magnitude(double[] vector) {
        return Math.sqrt(Arrays.stream(vector).map(i -> Math.pow(i, 2)).sum());
    }
}

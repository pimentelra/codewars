package katas.kyu6;

import java.util.Arrays;
import java.util.stream.*;

public class TribonacciSequence {
    public static double[] tribonacci(double[] s, int n) {
        double[] answer = DoubleStream.concat(Arrays.stream(new double[]{s[0], s[1], s[2]}), Arrays.stream(new double[n])).toArray();
        if (n > 3) IntStream.range(3, n).forEach(i -> answer[i] = answer[i - 3] + answer[i - 2] + answer[i - 1]);
        return Arrays.copyOfRange(answer, 0, n);
    }
}

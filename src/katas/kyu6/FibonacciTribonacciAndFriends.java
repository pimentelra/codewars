package katas.kyu6;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FibonacciTribonacciAndFriends {
    public static double[] xbonacci(double[] s, int n) {
        double[] answer = DoubleStream.concat(Arrays.stream(s), Arrays.stream(new double[n])).toArray();
        if (n > s.length) IntStream.range(s.length, n).forEachOrdered(i -> answer[i] = IntStream.rangeClosed(0, s.length).mapToDouble(j -> answer[i - j]).sum());
        return Arrays.copyOfRange(answer, 0, n);
    }
}

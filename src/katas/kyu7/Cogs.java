package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Cogs {
    public static double cogRpm(final int[] cogs) {
        double[] temp = IntStream.range(0, cogs.length - 1).mapToDouble(i -> cogs[i] / (double) cogs[i + 1]).toArray();
        return (cogs.length % 2 == 0 ? -1 : 1) * Arrays.stream(temp, 0, temp.length).reduce(1., (a, b) -> a * b);
    }
}

package katas.kyu7;

import java.util.stream.IntStream;

public class AveragesOfNumbers {
    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length < 2) return new double[]{};
        return IntStream.range(0, numbers.length - 1)
                .mapToDouble(i -> (numbers[i] + numbers[i + 1]) / 2d)
                .toArray();
    }
}

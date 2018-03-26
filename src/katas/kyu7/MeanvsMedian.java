package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MeanvsMedian {
    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.of(numbers).average().getAsDouble() < numbers[numbers.length / 2] ? "median" : IntStream.of(numbers).average().getAsDouble() > numbers[numbers.length / 2] ? "mean" : "same";
    }
}

package katas.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ProductOfMaximumsOfArrayArraySeries2 {
    public static long maxProduct(int[] numbers, int sub_size) {
        long[] clone = IntStream.of(numbers).boxed().sorted(Comparator.reverseOrder()).mapToLong(i -> i).toArray();
        return Arrays.stream(clone, 0, sub_size).reduce(1, (a, b) -> a * b);
    }
}

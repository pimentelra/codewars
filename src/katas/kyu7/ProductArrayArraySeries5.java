package katas.kyu7;

import java.util.Arrays;

public class ProductArrayArraySeries5 {
    public static long[] productArray(int[] numbers) {
        long product = Arrays.stream(numbers).asLongStream().reduce(1, (a, b) -> a * b);
        return Arrays.stream(numbers).mapToLong(i -> product / i).toArray();
    }
}

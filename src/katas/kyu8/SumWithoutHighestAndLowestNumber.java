package katas.kyu8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null) return 0;
        Arrays.sort(numbers);
        return IntStream.range(1, numbers.length - 1).map(i -> numbers[i]).sum();
    }
}

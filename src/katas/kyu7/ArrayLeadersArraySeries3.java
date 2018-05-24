package katas.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayLeadersArraySeries3 {
    public static List arrayLeaders(int[] numbers) {
        return IntStream.range(0, numbers.length).filter(i -> numbers[i] > Arrays.stream(Arrays.copyOfRange(numbers, i + 1, numbers.length)).sum()).mapToObj(i -> numbers[i]).collect(Collectors.toList());
    }
}

package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestValueOfAnArray {
    public static int findSmallest(final int[] numbers, final String toReturn) {
        return toReturn.equals("value") ? java.util.Arrays.stream(numbers).min().getAsInt() : IntStream.of(numbers).boxed().collect(Collectors.toList()).indexOf(java.util.Arrays.stream(numbers).min().getAsInt());
    }
}

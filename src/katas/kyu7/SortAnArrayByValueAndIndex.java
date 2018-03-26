package katas.kyu7;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SortAnArrayByValueAndIndex {
    public static int[] sortByValueAndIndex(int[] array) {
        return IntStream.range(0, array.length)
                .boxed()
                .sorted(Comparator.comparing(i -> (i + 1) * array[i]))
                .mapToInt(i -> array[i])
                .toArray();
    }
}

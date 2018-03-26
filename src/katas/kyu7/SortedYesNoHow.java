package katas.kyu7;

import java.util.stream.IntStream;

public class SortedYesNoHow {
    public static String isSortedAndHow(int[] array) {
        return IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]) ? "yes, ascending" : IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1]) ? "yes, descending" : "no";
    }
}

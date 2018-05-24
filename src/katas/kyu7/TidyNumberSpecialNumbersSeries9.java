package katas.kyu7;

import java.util.stream.IntStream;

public class TidyNumberSpecialNumbersSeries9 {
    public static boolean tidyNumber(int number) {
        int[] n = String.valueOf(number).chars().toArray();
        return IntStream.range(0, n.length - 1).allMatch(i -> n[i] - n[i + 1] <= 0);
    }
}

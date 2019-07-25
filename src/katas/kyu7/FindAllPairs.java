package katas.kyu7;

import java.util.Arrays;

public class FindAllPairs {
    public static int duplicates(int[] array) {
        return Arrays.stream(array).distinct().map(i -> (int) Arrays.stream(array).filter(e -> e == i).count() / 2).sum();
    }
}

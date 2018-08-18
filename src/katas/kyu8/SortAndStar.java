package katas.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndStar {
    public static String twoSort(String[] s) {
        return Arrays.stream(s).sorted().toArray(String[]::new)[0].chars().mapToObj(i -> "" + (char) i).collect(Collectors.joining("***"));
    }
}
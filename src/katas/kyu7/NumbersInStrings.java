package katas.kyu7;

import java.util.Arrays;

public class NumbersInStrings {
    public static int solve(String s) {
        return Arrays.stream(s.split("[^0-9]")).filter(t -> !t.isEmpty()).mapToInt(Integer::valueOf).max().getAsInt();
    }
}

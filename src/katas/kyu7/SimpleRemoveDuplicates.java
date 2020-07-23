package katas.kyu7;

import java.util.Arrays;

public class SimpleRemoveDuplicates {
    public static int[] solve(int[] arr) {
        String s = Arrays.toString(arr).replaceAll("(?<=[\\[ ,])(\\d+),(?=(?:[^,]*,)*\\s?\\1[,\\]])|[\\[\\]\\s]", "");
        return Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}

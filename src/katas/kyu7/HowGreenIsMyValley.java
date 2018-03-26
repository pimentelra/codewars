package katas.kyu7;

import java.util.Comparator;
import java.util.stream.IntStream;

public class HowGreenIsMyValley {
    public static int[] makeValley(int[] arr) {
        int[] answer = new int[arr.length];
        int[] sorted = IntStream.of(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        int k = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (i % 2 == 0) {
                answer[k] = sorted[i];
            } else {
                answer[sorted.length - 1 - k++] = sorted[i];
            }
        }
        return answer;
    }
}

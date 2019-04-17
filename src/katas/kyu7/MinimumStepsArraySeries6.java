package katas.kyu7;

import java.util.Arrays;

public class MinimumStepsArraySeries6 {
    public static int minimumSteps(int[] numbers, int k) {
        int[] sorted = Arrays.stream(numbers, 0, numbers.length).sorted().toArray();
        int count = 0;
        for (int i = 0; i < sorted.length; i++) if ((count += sorted[i]) >= k) return i;
        return 0;
    }
}

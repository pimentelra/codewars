package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PointsInSegments {
    public static int[] segments(final int m, final int[][] arr) {
        return IntStream.rangeClosed(0, m).filter(i -> Arrays.stream(arr).noneMatch(a -> a[0] <= i && i <= a[1])).toArray();
    }
}

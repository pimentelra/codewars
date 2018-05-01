package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SplitByValue {
    int[] splitByValue(int k, int[] elements) {
        IntStream lesser = Arrays.stream(elements).filter(i -> i < k);
        IntStream greater = Arrays.stream(elements).filter(i -> i >= k);

        return IntStream.concat(lesser, greater).toArray();
    }
}

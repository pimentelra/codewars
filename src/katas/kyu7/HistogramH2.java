package katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HistogramH2 {
    public static String histogram(final int[] results) {
        int sum = Arrays.stream(results).sum();
        return IntStream.range(0, results.length)
                .map(i -> results.length - i - 1)
                .mapToObj(j -> {
                    int freq = sum == 0 ? 0 : results[j] * 50 / sum;
                    return "" + (j + 1) + "|" + "\u2588".repeat(freq) + (results[j] == 0 ? "" : " " + (sum == 0 ? 0 : results[j] * 100 / sum) + "%") + "\n";
                })
                .collect(Collectors.joining());
    }
}

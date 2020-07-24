package katas.kyu7;

import java.util.stream.IntStream;

public class ConsecutiveSum {
    public static int consecutiveSum(int num) {
        return 1 + (int) IntStream.rangeClosed(2, (int) Math.sqrt(2 * num)).filter(i -> 2 * num % i == 0)
                .filter(i -> (((2 * num / i) - i) & 1) == 1).count();
    }
}

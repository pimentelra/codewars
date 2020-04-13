package katas.kyu6;

import java.util.stream.LongStream;

public class CountTheDivisibleNumbers {
    public static long divisibleCount(long x, long y, long k) {
        long first = LongStream.rangeClosed(x, y).filter(i -> i % k == 0).findFirst().orElse(-1);
        return first < 0 ? 0 : (y - first) / k + 1;
    }
}

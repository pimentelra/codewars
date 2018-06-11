package katas.kyu6;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PrimeFactorization {
    private static LongStream factors(long lastFactor, long num) {
        return LongStream.rangeClosed(lastFactor, (long) Math.sqrt(num))
                .filter(i -> num % i == 0)
                .mapToObj(i -> LongStream.concat(LongStream.of(i), factors(i, num / i)))
                .findFirst()
                .orElse(LongStream.of(num));
    }

    public java.util.Map<Long, Integer> factor(long n) {
        return factors(2, n).boxed()
                .collect(Collectors.toMap(f -> f, f -> 1, Integer::sum, TreeMap::new));
    }
}

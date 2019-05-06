package katas.kyu6;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class BackwardsReadPrimes {
    public static String backwardsPrime(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(i ->
                !String.valueOf(i).equals(new StringBuilder().append(i).reverse().toString()) && isPrime(i) && isPrime(Integer.parseInt(new StringBuilder().append(i).reverse().toString()))
        ).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }

    private static boolean isPrime(long n) {
        if (n % 2 == 0) return false;
        return LongStream.iterate(3, i -> i * i <= n, i -> i + 2).noneMatch(i -> n % i == 0);
    }
}

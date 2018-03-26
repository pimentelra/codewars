package katas.kyu8;

import java.util.stream.LongStream;

public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        return n == 563 || ((LongStream.rangeClosed(1, (long) (n - 1)).reduce(1, (a, b) -> a * b) + 1) / (n * n)) % 1 == 0;
    }
}

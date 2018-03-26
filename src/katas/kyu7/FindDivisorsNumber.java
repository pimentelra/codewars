package katas.kyu7;

import java.util.stream.IntStream;

public class FindDivisorsNumber {
    public long numberOfDivisors(int n) {
        return n < 1 ? 0 : (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}

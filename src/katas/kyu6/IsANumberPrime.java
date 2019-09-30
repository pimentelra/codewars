package katas.kyu6;

import java.util.stream.IntStream;

public class IsANumberPrime {
    public static boolean isPrime(int num) {
        return num > 1 && ((num & 1) != 0 || num == 2) &&
                IntStream.iterate(3, i -> i * i <= num, i -> i + 2).noneMatch(i -> num % i == 0);
    }
}

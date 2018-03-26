package katas.kyu7;

import java.util.stream.IntStream;

public class LuckyNumber {
    public static boolean isLucky(long n) {
        String number = Long.toString(n);
        int sum = IntStream.range(0, number.length()).filter(i -> number.substring(i, i + 1).matches("[0-9]")).map(i -> Integer.parseInt(number.substring(i, i + 1))).sum();
        return sum == 0 || sum % 9 == 0;
    }
}

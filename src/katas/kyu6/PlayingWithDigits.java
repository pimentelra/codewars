package katas.kyu6;

import java.util.stream.IntStream;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int number = (int) IntStream.range(0, digits.length).mapToDouble(i -> Math.pow(digits[i], i + p)).sum();
        return number % n == 0 ? number / n : -1;
    }
}

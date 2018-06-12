package katas.kyu6;

import java.util.stream.IntStream;

public class ValidateCreditCardNumber {
    public static boolean validate(String n) {
        return IntStream.range(0, n.length()).map(i -> {
            int x = Character.getNumericValue(n.charAt(n.length() - 1 - i));
            return i % 2 == 0 ? x : 2 * x > 9 ? 2 * x - 9 : 2 * x;
        }).sum() % 10 == 0;
    }
}

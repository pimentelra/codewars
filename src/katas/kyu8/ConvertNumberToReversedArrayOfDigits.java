package katas.kyu8;

import java.util.stream.IntStream;

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return IntStream.range(0, new StringBuilder(String.valueOf(n)).reverse().toString().length()).map(i -> Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(n)).reverse().toString().charAt(i)))).toArray();
    }
}

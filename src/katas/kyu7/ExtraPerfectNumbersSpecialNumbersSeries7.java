package katas.kyu7;

import java.util.stream.IntStream;

public class ExtraPerfectNumbersSpecialNumbersSeries7 {
    public static int[] extraPerfect(int number) {
        return IntStream.rangeClosed(1, number).filter(i -> i % 2 == 1).toArray();
    }
}

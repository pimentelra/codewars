package katas.kyu7;

import java.util.Arrays;

public class BingoOrNot {
    public static String bingo(int[] numberArray) {
        return Arrays.stream(numberArray).distinct().filter(n -> n == 2 || n == 7 || n == 9 || n == 14 || n == 15).count() == 5 ? "WIN" : "LOSE";
    }
}

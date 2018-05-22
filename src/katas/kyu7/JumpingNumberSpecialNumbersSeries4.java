package katas.kyu7;

import java.util.stream.IntStream;

public class JumpingNumberSpecialNumbersSeries4 {
    public static String jumpingNumber(int number) {
        int[] array = (number + "").chars().toArray();
        return IntStream.range(0, array.length - 1).allMatch(i -> Math.abs(array[i] - array[i + 1]) == 1) ? "Jumping!!" : "Not!!";
    }
}

package katas.kyu7;

import java.util.Arrays;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(array);
        return array[array.length - 1] + " " + array[0];
    }
}

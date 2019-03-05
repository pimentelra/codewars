package katas.kyu8;

import java.util.Arrays;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .map(s -> Arrays.stream(s.split(":")).mapToInt(Integer::parseInt).toArray())
                .mapToInt(arr -> arr[0] > arr[1] ? 3 : arr[0] == arr[1] ? 1 : 0)
                .sum();
    }
}

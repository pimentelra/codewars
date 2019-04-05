package katas.kyu7;

import java.util.Arrays;

public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
    }
}

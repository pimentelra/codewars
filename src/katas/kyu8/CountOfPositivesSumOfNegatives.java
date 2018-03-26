package katas.kyu8;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];

        int[] result = new int[2];
        Arrays.stream(input).forEach(anInput -> {
            if (anInput > 0) result[0] += 1;
            else result[1] += anInput;
        });
        return result;
    }
}

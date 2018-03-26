package katas.kyu8;

import java.util.Arrays;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).mapToInt(i -> i != null && i ? 1 : 0).sum();
    }
}

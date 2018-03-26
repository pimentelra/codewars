package katas.kyu7;

import java.util.Arrays;

public class Summy {
    static long summy(String stringOfInts) {
        String[] array = stringOfInts.split(" ");
        return Arrays.stream(array).mapToLong(Integer::parseInt).sum();
    }
}

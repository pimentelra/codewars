package katas.kyu8;

import java.util.stream.IntStream;

public class MyHeadIsAtTheWrongEnd {
    public static String[] fixTheMeerkat(String[] arr) {
        int length = arr.length;
        String[] solution = new String[length];
        IntStream.range(0, length).forEachOrdered(i -> solution[length - 1 - i] = arr[i]);

        return solution;
    }
}

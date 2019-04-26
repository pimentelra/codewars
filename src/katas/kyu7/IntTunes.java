package katas.kyu7;

import java.util.Arrays;

public class IntTunes {
    public static boolean isTune(int[] notes) {
        if (notes == null || notes.length == 0) return false;
        int[] sorted = Arrays.stream(notes).sorted().toArray();
        return Arrays.stream(new int[]{0, 2, 4, 5, 7, 9, 11}).anyMatch(i -> i == notes[0]) || sorted[1] - sorted[0] == 2;
    }
}

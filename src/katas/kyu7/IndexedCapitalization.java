package katas.kyu7;

import java.util.Arrays;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind) {
        char[] array = s.toCharArray();
        Arrays.stream(ind).filter(i -> i < array.length).forEach(j -> array[j] = Character.toUpperCase(array[j]));
        return String.valueOf(array);
    }
}

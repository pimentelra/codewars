package katas.kyu8;

import java.util.stream.IntStream;

public class altERnaTIngcAsEALTerNAtiNGCaSe {
    public static String toAlternativeString(String string) {
        char[] array = string.toCharArray();
        IntStream.range(0, array.length).forEach(i -> array[i] = Character.isLowerCase(array[i]) ? Character.toUpperCase(array[i]) : Character.toLowerCase(array[i]));
        return String.valueOf(array);
    }
}

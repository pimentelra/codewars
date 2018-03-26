package katas.kyu7;

import java.util.Arrays;

public class ExclamationMarksSeries5RemoveAllExclamationMarksFromTheEndOfWords {
    public static String removeBang(String str) {
        String[] array = str.split(" ");
        Arrays.setAll(array, i -> array[i].replaceAll("!+$", ""));
        return String.join(" ", array);
    }
}

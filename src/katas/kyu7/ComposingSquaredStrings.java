package katas.kyu7;

import java.util.Arrays;
import java.util.Collections;

public class ComposingSquaredStrings {
    public static String compose(String s1, String s2) {
        String[] array1 = s1.split("\n");
        String[] array2 = s2.split("\n");
        String[] answer = new String[array1.length];
        Collections.reverse(Arrays.asList(array2));

        for (int i = 0, j = array1[0].length(); i < array1.length; i++, j--)
            answer[i] = array1[i].substring(0, i + 1) + array2[i].substring(0, j);

        return String.join("\n", answer);
    }
}

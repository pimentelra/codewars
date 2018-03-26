package katas.kyu7;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        char[] testArray = test.toLowerCase().toCharArray();
        char[] originalArray = original.toLowerCase().toCharArray();
        Arrays.sort(testArray);
        Arrays.sort(originalArray);

        return Arrays.equals(testArray, originalArray);
    }
}

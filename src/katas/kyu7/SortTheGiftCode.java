package katas.kyu7;

import java.util.Arrays;

public class SortTheGiftCode {
    public static String sortGiftCode(String code) {
        char[] array = code.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }
}

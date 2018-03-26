package katas.kyu7;

import java.util.Arrays;

public class OrderingTheWords {
    public String orderWord(String s) {
        if (s == null || s.length() == 0) return "Invalid String!";
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return String.valueOf(array);
    }
}

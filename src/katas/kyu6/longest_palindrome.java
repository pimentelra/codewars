package katas.kyu6;

import java.util.ArrayList;
import java.util.List;

public class longest_palindrome {
    public static int longestPalindrome(final String s) {
        if (s == null || s.isEmpty()) return 0;
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) for (int j = i; j < s.length(); j++) subs.add(s.substring(i, j + 1));
        return subs.stream().filter(w -> w.equals(new StringBuilder(w).reverse().toString())).mapToInt(String::length).max().getAsInt();
    }
}

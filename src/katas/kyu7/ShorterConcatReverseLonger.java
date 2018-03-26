package katas.kyu7;

public class ShorterConcatReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        String shortest = a, longest = b;
        if (a.length() >= b.length()) {
            shortest = b;
            longest = a;
        }
        return shortest + new StringBuilder(longest).reverse().toString() + shortest;
    }
}

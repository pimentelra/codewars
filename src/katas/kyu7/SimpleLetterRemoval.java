package katas.kyu7;

public class SimpleLetterRemoval {
    public static String solve(String s, int k) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int letter = 0;
        while (k > 0 && letter < 26) {
            if (s.matches(".*" + alphabet.charAt(letter) + ".*")) {
                s = s.replaceFirst(String.valueOf(alphabet.charAt(letter)), "");
                k--;
            } else {
                letter++;
            }
        }
        return s;
    }
}

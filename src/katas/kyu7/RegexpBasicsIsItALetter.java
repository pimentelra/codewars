package katas.kyu7;

public class RegexpBasicsIsItALetter {
    public static boolean isLetter(String s) {
        return s.toLowerCase().matches("[a-z]");
    }
}

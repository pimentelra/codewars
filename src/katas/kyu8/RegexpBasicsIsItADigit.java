package katas.kyu8;

public class RegexpBasicsIsItADigit {
    public static boolean isDigit(String s) {
        return s.toCharArray().length == 1 && Character.isDigit(s.toCharArray()[0]);
    }
}

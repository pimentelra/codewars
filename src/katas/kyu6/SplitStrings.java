package katas.kyu6;

public class SplitStrings {
    public static String[] solution(String s) {
        if (s.length() % 2 == 1) s += "_";
        return s.split("(?<=\\G..)");
    }
}

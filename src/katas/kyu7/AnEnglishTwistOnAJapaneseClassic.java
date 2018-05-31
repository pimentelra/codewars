package katas.kyu7;

import java.util.List;

public class AnEnglishTwistOnAJapaneseClassic {
    public static List<String> theGame(List<String> words) {
        return words.subList(0, getLastIndex(words));
    }

    private static int getLastIndex(List<String> l) {
        int i = 0;
        for (; i < l.size(); i++) if (l.get(i).equals("") || i > 0 && l.get(i).charAt(0) != l.get(i - 1).charAt(l.get(i - 1).length() - 1)) return i;
        return i;
    }
}

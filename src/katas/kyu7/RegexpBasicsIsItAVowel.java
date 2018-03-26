package katas.kyu7;

public class RegexpBasicsIsItAVowel {
    public static boolean isVowel(String s) {
        return s.toLowerCase().matches("[aeiou]");
    }
}

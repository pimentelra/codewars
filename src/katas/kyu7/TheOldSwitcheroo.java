package katas.kyu7;

public class TheOldSwitcheroo {
    public static String vowel2Index(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            answer.append(s.substring(i, i + 1).matches("[aeiou]") ? Integer.valueOf(i + 1) : s.substring(i, i + 1));
        return answer.toString();
    }
}

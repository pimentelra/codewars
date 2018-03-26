package katas.kyu7;

import java.util.Map;

public class MakeBackronym {
    private static Map<String, String> dictionary = Preload.dictionary;

    public static String makeBackronym(String acronym) {
        String answer = "";
        for (int i = 0; i < acronym.length(); i++) {
            answer += dictionary.get(acronym.substring(i, i + 1).toUpperCase()) + " ";
        }
        return answer.trim();
    }
}

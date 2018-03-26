package katas.kyu7;

import java.util.HashMap;
import java.util.stream.IntStream;

public class CharacterCounter {
    public static boolean validateWord(String word) {
        HashMap<String, Integer> charMap = new HashMap<>();
        IntStream.range(0, word.length())
                .mapToObj(i -> word.toLowerCase().substring(i, i + 1))
                .forEach(temp -> charMap.put(temp, charMap.containsKey(temp) ? charMap.get(temp) + 1 : 1));

        return charMap.values()
                .stream()
                .noneMatch(anInt -> anInt != (int) charMap.values().toArray()[0]);
    }
}

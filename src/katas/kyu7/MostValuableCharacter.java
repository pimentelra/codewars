package katas.kyu7;

import java.util.Map;

public class MostValuableCharacter {
    public static char solve(String s) {
        return s.chars().distinct().mapToObj(c -> Map.entry((char) c, s.lastIndexOf(c) - s.indexOf(c)))
                .sorted((m1, m2) -> {
                    if (m1.getValue().equals(m2.getValue())) return m1.getKey() - m2.getKey();
                    return m2.getValue() - m1.getValue();
                }).map(Map.Entry::getKey).findFirst().get();
    }
}

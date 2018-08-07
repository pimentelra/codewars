package katas.kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Integer> occ = new HashMap<>();
        String lc = word.toLowerCase();
        lc.chars().distinct().forEach(c -> {
            if (!occ.containsKey((char) c)) occ.put((char) c, word.length() - lc.replace("" + (char) c, "").length());
        });

        return IntStream.range(0, word.length()).mapToObj(i -> occ.get(lc.charAt(i)) == 1 ? "(" : ")").collect(Collectors.joining());
    }
}

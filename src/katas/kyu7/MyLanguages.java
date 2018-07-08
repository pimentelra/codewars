package katas.kyu7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        return results.entrySet().stream().filter(e -> e.getValue() >= 60)
                .map(Map.Entry::getKey)
                .sorted((x, y) -> results.get(x) > results.get(y) ? -1 : results.get(x) < results.get(y) ? 1 : 0)
                .collect(Collectors.toList());
    }
}

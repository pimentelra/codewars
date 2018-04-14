package katas.kyu7;

import java.util.List;
import java.util.stream.Collectors;

public class SantasNaughtyList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return children.stream().distinct().filter(santasList::contains).distinct().sorted().collect(Collectors.toList());
    }
}

package katas.kyu7;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DifferenceBetweenTwoCollections {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        List<Character> diff = a.stream().distinct().filter(x -> !b.contains(x)).collect(Collectors.toList());

        diff.addAll(b.stream().distinct().filter(x -> !a.contains(x)).collect(Collectors.toList()));
        diff.sort(Character::compareTo);
        return diff;
    }
}

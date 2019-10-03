package katas.kyu7;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GuardingTheAlgoLandia {
    public static int findNeededGuards(boolean[] k) {
        return (int) Pattern.compile("1{2}").matcher(IntStream.range(0, k.length).mapToObj(b -> k[b] ? "0" : "1").collect(Collectors.joining())).results().count();
    }
}

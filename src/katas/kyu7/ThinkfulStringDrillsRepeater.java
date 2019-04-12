package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ThinkfulStringDrillsRepeater {
    public static String repeat(String string, long n) {
        return LongStream.range(0, n).mapToObj(i -> string).collect(Collectors.joining());
    }
}

package katas.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PossiblitiesArray {
    public static boolean isAllPossibilities(int[] arg) {
        return arg.length != 0 && IntStream.range(0, arg.length).noneMatch(i -> Arrays.stream(arg).noneMatch(x -> x == i));
    }
}

package katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        Arrays.setAll(skinScan, i -> Arrays.stream(skinScan[i]).map(String::valueOf).collect(Collectors.joining()).replaceAll("X", "\\*").split(""));
        return skinScan;
    }
}

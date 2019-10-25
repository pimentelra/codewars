package katas.kyu8;

import java.util.Arrays;

public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        long count = Arrays.stream(x).filter(s -> s.equals("good")).count();
        return count == 0 ? "Fail!" : count > 2 ? "I smell a series!" : "Publish!";
    }
}

package katas.kyu7;

import java.util.Arrays;

public class TheOfficeIOuted {
    public static String outed(Person[] meet, String boss) {
        return Arrays.stream(meet).mapToInt(p -> p.name.equals(boss) ? 2 * p.happiness : p.happiness).sum() / (double) meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}

package katas.kyu7;

import java.util.Objects;

public class GhostbustersWhitespaceRemoval {
    public static String ghostBusters(String building) {
        String answer = building.replaceAll("\\s", "");
        return Objects.equals(answer, building) ? "You just wanted my autograph didn't you?" : answer;
    }
}

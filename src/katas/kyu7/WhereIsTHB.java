package katas.kyu7;

public class WhereIsTHB {
    public static String testing(String initial) {
        return initial == null ? "" : initial.replaceAll("[^thbTHB]", "");
    }
}

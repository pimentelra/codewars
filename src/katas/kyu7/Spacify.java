package katas.kyu7;

public class Spacify {
    public static String spacify(String str) {
        return str.replaceAll(".(?!$)", "$0 ");
    }
}

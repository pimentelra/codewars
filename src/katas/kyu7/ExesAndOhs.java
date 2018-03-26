package katas.kyu7;

public class ExesAndOhs {
    public static boolean getXO(String str) {
        return str.toLowerCase().replaceAll("[^x]", "").length() == str.toLowerCase().replaceAll("[^o]", "").length();
    }
}

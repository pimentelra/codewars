package katas.kyu8;

public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return str.length() - str.replaceAll("" + letter, "").length();
    }
}

package katas.kyu7;

public class CountConsonants {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^b-df-hj-np-tv-z]", "").length();
    }
}

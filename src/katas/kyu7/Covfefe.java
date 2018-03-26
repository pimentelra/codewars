package katas.kyu7;

public class Covfefe {
    public static String covfefe(String tweet) {
        return tweet.replaceAll("coverage", "").length() != tweet.length() ? tweet.replaceAll("coverage", "covfefe") : tweet + " covfefe";
    }
}

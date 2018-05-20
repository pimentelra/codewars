package katas.kyu7;

public class BusMasteringWhoIsTheMostPrioritary {
    public static String arbitrate(String input, int n) {
        return input.replaceAll("(?<=(1))((?:(?!\\1).)*)\\1", "$20");
    }
}

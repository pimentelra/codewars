package katas.kyu7;

import java.util.Arrays;

public class DetermineIfPokerHandIsFlush {
    public static boolean CheckIfFlush(String[] cards) {
        return Arrays.stream(cards).allMatch(i -> i.endsWith(cards[0].substring(cards[0].length() - 1)));
    }
}

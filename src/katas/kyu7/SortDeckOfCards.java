package katas.kyu7;

import java.util.Arrays;
import java.util.Comparator;

public class SortDeckOfCards {
    private static final String ORDER = "A23456789TJQK";

    public static String[] sortCards(String[] cards) {
        Arrays.sort(cards, Comparator.comparingInt(ORDER::indexOf));
        return cards;
    }
}

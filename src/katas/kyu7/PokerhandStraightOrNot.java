package katas.kyu7;

import java.util.ArrayList;
import java.util.Collections;

public class PokerhandStraightOrNot {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.size() < 5) return false;

        if (cards.contains(14)) cards.add(1);
        Collections.sort(cards);
        return has5OrderedIntegers(cards);
    }

    private static boolean has5OrderedIntegers(ArrayList<Integer> arrayList) {
        int count = 1;
        for (int i = 0; i < arrayList.size() - 1 && (arrayList.size() - i - 1 + count) >= 5; i++) {
            count = arrayList.get(i + 1) - arrayList.get(i) == 0 ? count : arrayList.get(i + 1) - arrayList.get(i) == 1 ? count + 1 : 1;
            if (count == 5) return true;
        }
        return false;
    }
}

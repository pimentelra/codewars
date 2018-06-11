package katas.kyu6;

import java.util.Arrays;
import java.util.List;

public class SimpleCardGame {
    public String winner(String[] deckSteve, String[] deckJosh) {
        List<String> values = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A");
        int steve = 0, josh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            if (values.indexOf(deckSteve[i]) > values.indexOf(deckJosh[i])) {
                steve++;
                continue;
            }
            if (values.indexOf(deckSteve[i]) < values.indexOf(deckJosh[i])) josh++;
        }
        return steve > josh ? "Steve wins " + steve + " to " + josh : steve < josh ? "Josh wins " + josh + " to " + steve : "Tie";
    }
}

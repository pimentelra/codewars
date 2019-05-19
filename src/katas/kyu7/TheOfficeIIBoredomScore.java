package katas.kyu7;

import java.util.Arrays;
import java.util.Map;

public class TheOfficeIIBoredomScore {
    public static String boredom(Person[] staff) {
        Map<String, Integer> map = Map.of("accounts", 1, "finance", 2, "canteen", 10, "regulation", 3,
                "trading", 6, "change", 6, "IS", 8, "retail", 5, "cleaning", 4, "pissing about", 25);
        int total = Arrays.stream(staff).mapToInt(p -> map.get(p.department)).sum();
        return total <= 80 ? "kill me now" : total > 100 ? "party time!!" : "i can handle this";
    }
}

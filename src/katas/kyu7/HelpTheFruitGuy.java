package katas.kyu7;

import java.util.Arrays;
import java.util.Optional;

public class HelpTheFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        return Optional.ofNullable(fruitBasket).map(fruitBasket1 -> Arrays.stream(fruitBasket1).map(s -> s.replace("rotten", "").toLowerCase()).toArray(String[]::new)).orElseGet(() -> new String[]{});
    }
}

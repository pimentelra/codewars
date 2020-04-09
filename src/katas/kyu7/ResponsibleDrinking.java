package katas.kyu7;

import java.util.Arrays;

public class ResponsibleDrinking {
    public String hydrate(String drinkString) {
        int number = Arrays.stream(drinkString.split("[\\p{Alpha} ,]+")).mapToInt(Integer::parseInt).sum();
        return number + " glass" + (number > 1 ? "es" : "") + " of water";
    }
}

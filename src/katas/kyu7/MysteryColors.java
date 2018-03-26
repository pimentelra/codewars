package katas.kyu7;

import java.util.List;

public class MysteryColors {
    public int numberOfDistinctColors(List<Color> mysteryColors){
        return (int) mysteryColors.stream().distinct().count();
    }

    public int colorOccurrence(List<Color> mysteryColors, Color color){
        return (int) mysteryColors.stream().filter(x -> x == color).count();
    }
}

package katas.kyu8;

public class ThinkfulNumberDrillsBlueAndRedMarbles {
    public static double guessBlue(int bS, int rS, int bP, int rP) {
        return (bS - bP) / ((bS - bP + rS - rP) * 1d);
    }
}

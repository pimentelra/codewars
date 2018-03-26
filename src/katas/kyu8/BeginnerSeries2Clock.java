package katas.kyu8;

public class BeginnerSeries2Clock {
    public static int Past(int h, int m, int s) {
        return ((3600 * h) + (60 * m) + s) * 1000;
    }
}

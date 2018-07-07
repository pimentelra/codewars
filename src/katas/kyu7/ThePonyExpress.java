package katas.kyu7;

public class ThePonyExpress {
    public static int riders(final int[] stations) {
        int riders = 1, distance = 0;
        for (int station : stations) {
            distance += station;
            if (distance > 100) {
                riders++;
                distance = station;
            }
        }
        return riders;
    }
}

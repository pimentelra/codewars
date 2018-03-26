package katas.kyu8;

public class MilesPerGallonToKilometersPerLiter {
    public static float mpgToKPM(final float mpg) {
        return (float) (Math.round(mpg * (1.609344f / 4.54609188f) * 100) / 100.);
    }
}

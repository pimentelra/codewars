package katas.kyu7;

public class AManAndHisEarthlyMeasurement {
    public static double circumference(double rodHeight, double shadowLength, double distanceToWell) {
        return 360 * distanceToWell / Math.toDegrees(Math.atan2(shadowLength, rodHeight));
    }
}

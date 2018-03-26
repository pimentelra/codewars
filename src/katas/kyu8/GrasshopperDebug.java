package katas.kyu8;

public class GrasshopperDebug {
    public static String weatherInfo(double temp) {
        double c = (temp - 32) * 5 / 9;
        return c + ((c <= 0) ? " is freezing temperature" : " is above freezing temperature");
    }
}

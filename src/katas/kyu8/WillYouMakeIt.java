package katas.kyu8;

public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return fuelLeft * mpg >= distanceToPump;
    }
}

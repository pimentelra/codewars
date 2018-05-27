package katas.kyu7;

public class HowLongShouldYouCookThisFor {
    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        int totalPower = Integer.parseInt(neededPower.substring(0, neededPower.length() - 1)) * (minutes * 60 + seconds);
        int totalTime = (int) Math.ceil(totalPower / (double) Integer.parseInt(power.substring(0, power.length() - 1)));

        return totalTime / 60 + " minutes " + totalTime % 60 + " seconds";
    }
}

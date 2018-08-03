package katas.kyu6;

public class WindComponentCalculation {
    public static String message(String rwy, int windDirection, int windSpeed) {
        double radians = Math.toRadians(Integer.parseInt(rwy.replaceAll("[^\\d.]", "")) * 10 - windDirection);
        int cos = (int) Math.round(Math.cos(radians) * windSpeed);
        int sin = (int) Math.round(Math.sin(radians) * windSpeed);
        return String.format("%swind %d knots. Crosswind %d knots from your %s.",
                (cos < 0) ? "Tail" : "Head", Math.abs(cos), Math.abs(sin), (sin > 0) ? "left" : "right");
    }
}

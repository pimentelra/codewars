package katas.kyu8;

public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return dish.startsWith(beast.substring(0, 1)) && dish.endsWith(beast.substring(beast.length() - 1));
    }
}

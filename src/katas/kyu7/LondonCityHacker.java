package katas.kyu7;

public class LondonCityHacker {
    public static String londonCityHacker(Object[] journey) {
        double price = 0; int previous = 0;
        for (Object o : journey) {
            if (o instanceof String) { price += 2.4; previous = 0;
            } else price += previous++ % 2 == 0 ? 1.5 : 0;
        }
        return String.format("£%.2f", price);
    }
}

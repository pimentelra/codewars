package katas.kyu7;

public class RegexpBasicsParsingPrices {
    public static Integer toCents(String price) {
        return price.matches("\\$[0-9]+\\.[0-9]{2}") ? Integer.parseInt(price.substring(1).replace(".", "")) : null;
    }
}

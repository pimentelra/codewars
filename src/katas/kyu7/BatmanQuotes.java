package katas.kyu7;

public class BatmanQuotes {
    public static String getQuote(String[] quotes, String hero) {
        String name = hero.toLowerCase().charAt(0) == 'b' ? "Batman" : hero.toLowerCase().charAt(0) == 'r' ? "Robin" : "Joker";
        return name + ": " + quotes[Integer.parseInt(hero.replaceAll("[^\\d]", ""))];
    }
}

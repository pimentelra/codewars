package katas.kyu7;

public class HeavyMetalUmlauts {
    public static String heavyMetalUmlauts(String boringText) {
        return boringText.replace("A", "Ä")
                .replace("E", "Ë")
                .replace("I", "Ï")
                .replace("O", "Ö")
                .replace("U", "Ü")
                .replace("Y", "Ÿ")
                .replace("a", "ä")
                .replace("e", "ë")
                .replace("i", "ï")
                .replace("o", "ö")
                .replace("u", "ü")
                .replace("y", "ÿ");
    }
}

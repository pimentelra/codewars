package katas.kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[1234]", "0").replaceAll("[56789]", "1");
    }
}

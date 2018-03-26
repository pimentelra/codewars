package katas.kyu7;

public class TheOfficeIIIBrokenPhotocopier {
    public static String broken(final String x) {
        return x.replaceAll("0", "X").replace("1", "0").replaceAll("X", "1");
    }
}

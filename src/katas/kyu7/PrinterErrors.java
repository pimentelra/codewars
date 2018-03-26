package katas.kyu7;

public class PrinterErrors {
    public static String printerError(String s) {
        return (s.length() - s.replaceAll("[^a-m]", "").length()) + "/" + s.length();
    }
}

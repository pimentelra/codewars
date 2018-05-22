package katas.kyu7;

public class SpecialNumberSpecialNumbersSeries5 {
    public static String specialNumber(int number) {
        return String.valueOf(number).replaceAll("[0-5]", "").length() == 0 ? "Special!!" : "NOT!!";
    }
}

package katas.kyu7;

public class OddEvenStringSort {
    public static String sortMyString(String s) {
        return s.replaceAll("(.).?", "$1") + " " + s.replaceAll(".(.)?", "$1");
    }
}

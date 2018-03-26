package katas.kyu8;

public class FindThePosition {
    public static String position(char alphabet) {
        return "Position of alphabet: " + String.valueOf((int) alphabet - (int) 'a' + 1);
    }
}

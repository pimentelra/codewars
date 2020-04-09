package katas.kyu7;

public class ShiftLeft {
    public static int shiftLeft(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        for (; i >= 0 && j >= 0 && a.charAt(i) == b.charAt(j); i--, j--) { }
        return i + j + 2;
    }
}

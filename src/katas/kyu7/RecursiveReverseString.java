package katas.kyu7;

public class RecursiveReverseString {
    public String reverse(String str) {
        int length = str.length();
        return length == 1 ? str : String.valueOf(str.charAt(length - 1)) + reverse(str.substring(0, length - 1));
    }
}

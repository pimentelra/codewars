package katas.kyu7;

public class ReverseANumber {
    public static int reverse(int number) {
        return (number < 0 ? -1 : 1) * Integer.parseInt(new StringBuilder("" + Math.abs(number)).reverse().toString());
    }
}

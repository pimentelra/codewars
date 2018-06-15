package katas.kyu6;

public class SumOfDigitsDigitalRoot {
    public static int digital_root(int n) {
        return n % 9 == 0 && n > 0 ? 9 : n % 9;
    }
}

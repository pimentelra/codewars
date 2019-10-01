package katas.kyu7;

public class SimpleFun2CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        return (n / 2 + firstNumber) % n;
    }
}

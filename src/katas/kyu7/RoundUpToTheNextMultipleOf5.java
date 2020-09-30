package katas.kyu7;

public class RoundUpToTheNextMultipleOf5 {
    public static int roundToNext5(int number) {
        return (int) (Math.ceil(number / 5.) * 5);
    }
}

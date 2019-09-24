package katas.kyu7;

public class LunarMathematicsAddition {
    public static long add(long number1, long number2) {
        long result = 0, position = 1;

        while (number1 > 0 || number2 > 0) {
            result += Math.max(number1 % 10, number2 % 10) * position;
            number1 /= 10; number2 /= 10; position *= 10;
        }
        return result;
    }
}

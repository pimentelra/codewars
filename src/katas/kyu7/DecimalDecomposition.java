package katas.kyu7;

public class DecimalDecomposition {
    public static String decimalDecomposition(int number) {
        StringBuilder answer = new StringBuilder();
        int index = 1;
        while (number > 0) {
            String temp = String.valueOf(number % 10 * index);
            if (answer.length() > 0) temp += "+";
            if (number % 10 != 0) answer.insert(0, temp);
            number /= 10;
            index *= 10;
        }
        return answer.toString();
    }
}

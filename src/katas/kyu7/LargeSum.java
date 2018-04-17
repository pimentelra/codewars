package katas.kyu7;

public class LargeSum {
    public static String firstTenDigitsOfSum(String[] numbers) {
        StringBuilder answer = new StringBuilder();

        int carry = 0;
        for (int i = numbers[0].length() - 1; i >= 0; i--) {
            for (String number : numbers) carry += Character.getNumericValue(number.charAt(i));
            answer.insert(0, carry % 10);
            carry /= 10;
        }

        if (carry > 0) answer.insert(0, carry);

        return answer.substring(0, 10);
    }
}

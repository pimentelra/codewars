package katas.kyu7;

public class NameThatNumber {
    public static String nameThatNumber(int x) {
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] nums = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String answer;

        if (x == 0) return "zero";

        if (x < 20) {
            return nums[x];
        } else {
            answer = nums[x % 10];
            x /= 10;
            return tens[x] + ((answer.length() > 0) ? " " + answer : "");
        }
    }
}

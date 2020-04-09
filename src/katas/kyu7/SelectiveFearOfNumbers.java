package katas.kyu7;

public class SelectiveFearOfNumbers {
    static public boolean AmIAfraid(final String day, final int num) {
        return day.equals("Monday") && num == 12
                || day.equals("Tuesday") && num > 95
                || day.equals("Wednesday") && num == 34
                || day.equals("Thursday") && num == 0
                || day.equals("Friday") && num % 2 == 0
                || day.equals("Saturday") && num == 56
                || day.equals("Sunday") && Math.abs(num) == 666;
    }
}

package katas.kyu7;

public class RegexValidationOf24HoursTime {
    public static boolean validateTime(String time) {
        return time.matches("(?:[0-1]?[0-9]|2[0-3]):[0-5][0-9]");
    }
}

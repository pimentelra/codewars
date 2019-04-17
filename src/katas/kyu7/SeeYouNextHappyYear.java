package katas.kyu7;

public class SeeYouNextHappyYear {
    static public int nextHappyYear(int year) {
        while (true) if (String.valueOf(++year).matches("^(?!.*(.).*\\1)\\d{4}")) return year;
    }
}

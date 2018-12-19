package katas.kyu8;

public class HolidayVIIIDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int)(hol * 1. / (normPrice * discount / 100.));
    }
}

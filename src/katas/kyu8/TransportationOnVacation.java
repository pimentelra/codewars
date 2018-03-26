package katas.kyu8;

public class TransportationOnVacation {
    public static int rentalCarCost(int d) {
        int answer = d * 40;

        if (d >= 7) answer -= 50;
        if (d >= 3 && d < 7) answer -= 20;

        return answer;
    }
}

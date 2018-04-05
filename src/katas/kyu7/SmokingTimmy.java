package katas.kyu7;

public class SmokingTimmy {
    public static int startSmoking(int bars, int boxes) {
        int total = bars * 180 + boxes * 18;
        for (int i = 5; i < total; i++) if (i % 5 == 0) total++;
        return total;
    }
}
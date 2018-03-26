package katas.kyu7;

public class DeodorantEvaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double currentContent = content;
        int count = 0;
        while (currentContent >= content * threshold / 100) {
            currentContent -= currentContent * evap_per_day / 100;
            count++;
        }
        return count;
    }
}

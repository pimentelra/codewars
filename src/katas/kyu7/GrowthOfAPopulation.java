package katas.kyu7;

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int total = p0 + (int) (p0 * (percent / 100)) + aug;
        int count = 1;
        while (total < p) {
            total += (int) (total * (percent / 100)) + aug;
            count++;
        }
        return count;
    }
}

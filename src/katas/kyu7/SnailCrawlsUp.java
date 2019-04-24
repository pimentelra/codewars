package katas.kyu7;

public class SnailCrawlsUp {
    public static int snail(int column, int day, int night) {
        return (int) Math.ceil(Math.max(1, column - night) / (double) (day - night));
    }
}

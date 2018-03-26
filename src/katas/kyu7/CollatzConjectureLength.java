package katas.kyu7;

public class CollatzConjectureLength {
    public static long conjecture(long x) {
        long length = 1;
        while (x != 1) {
            x = (x % 2 == 0) ? x / 2 : (x * 3) + 1;
            length++;
        }
        return length;
    }
}

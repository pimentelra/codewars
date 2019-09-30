package katas.kyu7;

public class Friends {
    public static int friends(int n) {
        return n <= 2 ? 0 : (int) Math.ceil(Math.log(n) / Math.log(2)) - 1;
    }
}

package katas.kyu7;

public class TheFuscFunctionPart1 {
    public static int fusc(int n) {
        return (n >= 0 && n <= 1) ? n : (n % 2 == 0) ? fusc(n / 2) : fusc((n - 1) / 2) + fusc(n + 1);
    }
}

package katas.kyu6;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public static String collatz(int n) {
        List<String> list = new ArrayList<>();
        list.add(String.valueOf(n));
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            list.add(String.valueOf(n));
        }
        return String.join("->", list);
    }
}

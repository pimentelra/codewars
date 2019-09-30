package katas.kyu6;

public class BuildAPileOfCubes {
    public static long findNb(long m) {
        long sum = 0, n = 0;
        while (sum < m) sum += ++n * n * n;
        return sum == m ? n : -1;
    }
}

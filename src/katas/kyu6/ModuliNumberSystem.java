package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ModuliNumberSystem {
    public static String fromNb2Str(int n, int[] sys) {
        return Arrays.stream(sys).reduce(1, (x, y) -> x * y) > n &&
                Arrays.stream(sys).noneMatch(x -> Arrays.stream(sys).anyMatch(y -> (y > x && coprime(y, x) == 0))) ?
                String.format("-%s-", Arrays.stream(sys).map(i -> n % i).mapToObj(v -> "" + v).collect(Collectors.joining("--"))) : "Not applicable";
    }

    private static int coprime(int x, int y) {
        return x % y > 1 ? coprime(y, x % y) : x % y;
    }
}

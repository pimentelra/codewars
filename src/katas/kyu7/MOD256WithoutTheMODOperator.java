package katas.kyu7;

public class MOD256WithoutTheMODOperator {
    public static int mod256WithoutMod(int number) {
        if (number < 0) {
            number *= -1;
            return (number - ((number >> 8) << 8)) * -1;
        }
        return (number - ((number >> 8) << 8));
    }
}

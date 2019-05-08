package katas.kyu6;

public class PizzaPieces {
    public static int maxPizza(int cut) {
        return cut < 0 ? -1 : cut * cut + cut + 2 >> 1;
    }
}

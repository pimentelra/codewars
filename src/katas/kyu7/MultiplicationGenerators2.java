package katas.kyu7;

public class MultiplicationGenerators2 {
}

class Generator {

    private final int a;
    private int num = 0;

    private Generator(int a) {
        this.a = a;
    }

    public static Generator of(int a) {
        return new Generator(a);
    }

    public String next() {
        return a + " x " + ++num + " = " + (a * num);
    }
}

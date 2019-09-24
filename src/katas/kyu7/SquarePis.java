package katas.kyu7;

public class SquarePis {
}

class SquarePi {
    private int digits;
    private String pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

    public SquarePi(int digits) { this.digits = digits; }

    public int calculate() {
        return (int) Math.ceil(Math.sqrt(pi.substring(0, digits).chars().map(d -> (int) Math.pow(d - 48, 2)).sum()));
    }
}

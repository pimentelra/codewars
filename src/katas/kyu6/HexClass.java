package katas.kyu6;

public class HexClass {
}

class Hex {
    private int value;

    public Hex(int value) {
        this.value = value;
    }

    public int valueOf() {
        return value;
    }

    public String toJSON() {
        return toString();
    }

    public String toString() {
        return "0x" + Integer.toHexString(value).toUpperCase();
    }

    public Hex plus(Hex other) {
        return new Hex(value + other.valueOf());
    }

    public Hex minus(Hex other) {
        return new Hex(value - other.valueOf());
    }

    public Hex plus(int number) {
        return new Hex(value + number);
    }

    public Hex minus(int number) {
        return new Hex(value - number);
    }

    public static int parse(String string) {
        return Integer.parseInt(string.contains("x") ? string.split("x")[1] : string, 16);
    }

    public boolean equals(Object other) {
        return value == ((Hex) other).valueOf();
    }
}

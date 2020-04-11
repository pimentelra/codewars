package katas.kyu7;

public class Null {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == null || obj instanceof Null;
    }

    @Override
    public String toString() {
        return "null";
    }
}

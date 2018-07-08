package katas.kyu8;

public class FIXMEStaticelectrickery {
}

class Dinglemouse {
    public static final Dinglemouse INST = new Dinglemouse();
    private int ONE_HUNDRED = 100;
    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
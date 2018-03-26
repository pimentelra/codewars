package katas.kyu7;

public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue - 1 < 0 ? 0 : (nBlue - 1) * 2;
    }
}

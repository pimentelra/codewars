package katas.kyu8;

public class ParseNiceIntFromCharProblem {
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}

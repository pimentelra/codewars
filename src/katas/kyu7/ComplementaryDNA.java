package katas.kyu7;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        return dna.replaceAll("T", "-")
                .replaceAll("A", "T")
                .replaceAll("-", "A")
                .replaceAll("C", "-")
                .replaceAll("G", "C")
                .replaceAll("-", "G");
    }
}

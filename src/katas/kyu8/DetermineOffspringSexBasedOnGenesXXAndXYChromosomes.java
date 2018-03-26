package katas.kyu8;

public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {
    public static String chromosomeCheck(String sperm) {
        return sperm.charAt(1) == 'Y' ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}

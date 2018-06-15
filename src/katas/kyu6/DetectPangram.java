package katas.kyu6;

public class DetectPangram {
    public boolean check(String sentence) {
        return sentence.replaceAll("[^\\p{Alpha}]", "").toLowerCase().chars().distinct().sum() == 2847;
    }
}

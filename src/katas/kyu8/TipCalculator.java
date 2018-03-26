package katas.kyu8;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        String ratingLowerCase = rating.toLowerCase();
        switch (ratingLowerCase) {
            case "terrible":
                return 0;
            case "poor":
                return (int) (Math.ceil(amount * 0.05));
            case "good":
                return (int) (Math.ceil(amount * 0.1));
            case "great":
                return (int) (Math.ceil(amount * 0.15));
            case "excellent":
                return (int) (Math.ceil(amount * 0.2));
            default:
                return null;
        }
    }
}

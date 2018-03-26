package katas.kyu7;

public class EANValidation {
    public static boolean validate(final String eanCode) {
        int calculatedChecksum = 0;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            int tempValue = Integer.valueOf(eanCode.substring(i, i + 1));
            calculatedChecksum += i % 2 == 0 ? tempValue : tempValue * 3;
        }
        return calculatedChecksum % 10 == 0 ? Integer.parseInt(eanCode.substring(eanCode.length() - 1)) == 0 : Integer.parseInt(eanCode.substring(eanCode.length() - 1)) == 10 - (calculatedChecksum % 10);
    }
}

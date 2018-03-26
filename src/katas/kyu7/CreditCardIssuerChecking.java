package katas.kyu7;

public class CreditCardIssuerChecking {
    public static String getIssuer(String cardNumber) {
        if (isAMEX(cardNumber)) return "AMEX";
        if (isDiscover(cardNumber)) return "Discover";
        if (isMastercard(cardNumber)) return "Mastercard";
        if (isVISA(cardNumber)) return "VISA";
        return "Unknown";
    }

    private static boolean isAMEX(String cardNumber) {
        return cardNumber.length() == 15 && (cardNumber.substring(0, 2).equals("34") || cardNumber.substring(0, 2).equals("37"));
    }

    private static boolean isDiscover(String cardNumber) {
        return cardNumber.length() == 16 && cardNumber.substring(0, 4).equals("6011");
    }

    private static boolean isMastercard(String cardNumber) {
        return cardNumber.length() == 16 &&
                (cardNumber.substring(0, 2).equals("51") || cardNumber.substring(0, 2).equals("52") ||
                        cardNumber.substring(0, 2).equals("53") || cardNumber.substring(0, 2).equals("54") ||
                        cardNumber.substring(0, 2).equals("55"));
    }

    private static boolean isVISA(String cardNumber) {
        return (cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.substring(0, 1).equals("4");
    }
}

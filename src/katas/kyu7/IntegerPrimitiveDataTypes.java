package katas.kyu7;

import java.math.BigInteger;

public class IntegerPrimitiveDataTypes {
    public String determineType(String number) {
        int bitLength;
        try {
            bitLength = BigInteger.valueOf(Long.parseLong(number)).bitLength();
        } catch (NumberFormatException ex) {
            return "none";
        }
        if (bitLength < 8) return "byte";
        if (bitLength < 16) return "short";
        if (bitLength < 32) return "int";
        return "long";
    }
}

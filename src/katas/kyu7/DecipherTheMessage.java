package katas.kyu7;

public class DecipherTheMessage {
    public static String decipher(String codedMessage) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < codedMessage.length(); i++) {
            int code = codedMessage.charAt(i);
            if (code >= 65 && code <= 90) code = code + 7 > 90 ? code + 7 - 26 : code + 7;
            if (code >= 97 && code <= 122) code = code + 7 > 122 ? code + 7 - 26 : code + 7;
            decodedMessage.append(String.valueOf((char) code));
        }
        return decodedMessage.toString();
    }
}

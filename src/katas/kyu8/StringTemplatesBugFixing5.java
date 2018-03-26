package katas.kyu8;

import java.text.MessageFormat;

public class StringTemplatesBugFixing5 {
    public static String buildString(String... args) {
        return MessageFormat.format("I like {0}!", String.join(", ", args));
    }
}

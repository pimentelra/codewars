package katas.kyu8;

import java.util.HashMap;

public class Welcome {
    public static String greet(String language){
        HashMap<String, String> translations = new HashMap<>();
        translations.put("english", "Welcome");
        translations.put("czech", "Vitejte");
        translations.put("danish", "Velkomst");
        translations.put("dutch", "Welkom");
        translations.put("estonian", "Tere tulemast");
        translations.put("finnish", "Tervetuloa");
        translations.put("flemish", "Welgekomen");
        translations.put("french", "Bienvenue");
        translations.put("german", "Willkommen");
        translations.put("irish", "Failte");
        translations.put("italian", "Benvenuto");
        translations.put("latvian", "Gaidits");
        translations.put("lithuanian", "Laukiamas");
        translations.put("polish", "Witamy");
        translations.put("spanish", "Bienvenido");
        translations.put("swedish", "Valkommen");
        translations.put("welsh", "Croeso");

        return translations.getOrDefault(language, "Welcome");
    }
}

package katas.kyu7;

import java.util.HashMap;

public class InteractiveDictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void newEntry(String word, String entries) {
        dictionary.put(word, entries);
    }

    public String look(String word) {
        String result = dictionary.get(word);
        return result == null ? "Cant find entry for " + word : result;
    }
}

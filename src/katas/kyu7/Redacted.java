package katas.kyu7;

public class Redacted {
    public static boolean redacted(String doc1, String doc2) {
        return doc2.matches(doc1.replaceAll("[\\\\.\\[\\]{}()<>*+\\-=!?^$|]", "\\\\$0").replace('X', '.'));
    }
}

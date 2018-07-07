package katas.kyu7;

public class TVRemote {
    public static int tvRemote(final String word) {
        String remote = "abcde123fghij456klmno789pqrst.@0uvwxyz_/";
        int previous = 0, times = word.length();
        for (int i = 0; i < word.length(); i++) {
            int next = remote.indexOf(word.charAt(i));
            times += (Math.abs(previous / 8 - next / 8) + Math.abs(previous % 8 - next % 8));
            previous = next;
        }
        return times;
    }
}

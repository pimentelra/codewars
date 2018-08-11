package katas.kyu6;

public class TakeATenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int n = 0, s = 0, w = 0, e = 0;
        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n') n++;
            else if (walk[i] == 's') s++;
            else if (walk[i] == 'w') w++;
            else if (walk[i] == 'e') e++;
        }

        return walk.length == 10 && n == s && w == e;
    }
}

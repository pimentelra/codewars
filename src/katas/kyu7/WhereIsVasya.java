package katas.kyu7;

public class WhereIsVasya {
    public static int whereIsHe(int p, int bef, int aft) {
        return aft < p - bef ? aft + 1 : p - bef;
    }
}

package katas.kyu7;

public class EliminateTheIntrudersBitManipulation {
    public long eliminateUnsetBits(String number) {
        return number.replace("0", "").length() == 0 ? 0 : Long.parseLong(number.replace("0", ""), 2);
    }
}

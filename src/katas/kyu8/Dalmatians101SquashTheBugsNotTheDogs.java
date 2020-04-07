package katas.kyu8;

public class Dalmatians101SquashTheBugsNotTheDogs {
    public static String howManyDalmatians(int n) {
        String[] dogs = new String[]{"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};
        return n < 11 ? dogs[0] : n < 51 ? dogs[1] : n == 101 ? dogs[3] : dogs[2];
    }
}

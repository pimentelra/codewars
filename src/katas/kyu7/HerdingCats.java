package katas.kyu7;

import java.util.Comparator;

public class HerdingCats implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.weight == cat2.weight ? 0 : cat1.weight > cat2.weight ? 1 : -1;
    }
}

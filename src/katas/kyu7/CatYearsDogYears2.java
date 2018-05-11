package katas.kyu7;

public class CatYearsDogYears2 {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        return new int[]{
                catYears < 15 ? 0 : catYears <= 20 ? 1 : 1 + ((catYears - 20) / 4),
                dogYears < 15 ? 0 : dogYears <= 19 ? 1 : 1 + ((dogYears - 19) / 5)};
    }
}

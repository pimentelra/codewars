package katas.kyu7;

public class SimpleFun74GrowingPlant {
    public static int growingPlant(int up, int down, int height) {
        return height < up ? 1 : (int) Math.ceil((height - down) / (double) (up - down));
    }
}

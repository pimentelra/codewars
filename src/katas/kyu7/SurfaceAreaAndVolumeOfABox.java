package katas.kyu7;

public class SurfaceAreaAndVolumeOfABox {
    public int[] getSize(int w, int h, int d) {
        return new int[]{2 * (w * h + w * d + h * d), w * h * d};
    }
}

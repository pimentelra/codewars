package katas.kyu7;

public class WASDMovement {
    public float[] getVector(boolean[] wasd) {
        int x = 0, y = 0;
        y += wasd[0] ? 1 : 0;
        x += wasd[1] ? -1 : 0;
        y += wasd[2] ? -1 : 0;
        x += wasd[3] ? 1 : 0;

        if (x == 0 || y == 0) return new float[]{x, y};

        double arctan = Math.atan(y / x);

        return new float[]{(float) Math.cos(arctan) * x, (float) Math.sin(arctan) * y};
    }
}

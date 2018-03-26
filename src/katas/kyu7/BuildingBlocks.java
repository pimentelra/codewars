package katas.kyu7;

public class BuildingBlocks {
    private int[] values;

    public Block(int[] values) {
        this.values = values;
    }

    public int getWidth() {
        return this.values[0];
    }

    public int getLength() {
        return this.values[1];
    }

    public int getHeight() {
        return this.values[2];
    }

    public int getVolume() {
        return getWidth() * getLength() * getHeight();
    }

    public int getSurfaceArea() {
        return 2 * (getWidth() * getLength() + getWidth() * getHeight() + getLength() * getHeight());
    }
}

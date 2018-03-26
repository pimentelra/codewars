package katas.kyu8;

public class ColorGhost {
    private static int index = 0;
    private String color;

    public ColorGhost() {
        index += 1;
        String[] colorArray = new String[]{"white", "yellow", "purple", "red"};
        this.color = colorArray[index % 4];
    }

    public String getColor() {
        return this.color;
    }
}

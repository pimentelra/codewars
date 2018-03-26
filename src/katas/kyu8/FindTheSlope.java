package katas.kyu8;

public class FindTheSlope {
    public String slope(int[] points) {
        return points[2] - points[0] == 0 ? "undefined" : String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
    }
}

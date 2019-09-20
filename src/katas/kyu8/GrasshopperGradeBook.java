package katas.kyu8;

public class GrasshopperGradeBook {
    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        return avg < 60 ? 'F' : avg < 70 ? 'D' : avg < 80 ? 'C' : avg < 90 ? 'B' : 'A';
    }
}

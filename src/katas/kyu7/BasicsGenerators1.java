package katas.kyu7;

public class BasicsGenerators1 {
    int number = 1;

    public int next() {
        return number++;
    }

    public int next(int number) {
        this.number = number;
        return number++;
    }
}

package katas.kyu8;

public class SwapValues {
    public Object[] arguments;

    public SwapValues(Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}

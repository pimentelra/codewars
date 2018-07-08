package katas.kyu7;


public class CircularList<T> {
    private T[] elements;
    private int current = -1;

    public CircularList(final T... elements) throws IllegalArgumentException {
        if (elements == null || elements.length == 0) throw new IllegalArgumentException("Illegal argument provided to CircularList constructor!");
        this.elements = elements;
    }

    T next() {
        return this.elements[current = current + 1 >= elements.length ? 0 : ++current];
    }

    T prev() {
        return this.elements[current = current - 1 < 0 ? elements.length - 1 : --current];
    }
}

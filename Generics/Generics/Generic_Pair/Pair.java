package Generics.Generic_Pair;

public class Pair<T,U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public U getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }
}
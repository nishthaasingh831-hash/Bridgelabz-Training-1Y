package Generics.MaxValue;

public class Max <T>{
    public static <T extends Comparable<T>> T max(T a,T b,T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(13,43,23));
    }
}
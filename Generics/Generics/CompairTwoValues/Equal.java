package Generics.CompairTwoValues;

import java.util.Scanner;

public class Equal<T> {
    public static <T> boolean isEqual(T a, T b){
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(Equal.isEqual(17,98));
    }
}
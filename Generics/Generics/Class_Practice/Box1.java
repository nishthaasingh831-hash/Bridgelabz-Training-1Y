package Generics.Class_Practice;

import java.util.ArrayList;

public class Box1 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("uha");
        l.add(28);
        l.add(3.2);
        l.add("n");
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        System.out.println(l.get(3));

    }
}
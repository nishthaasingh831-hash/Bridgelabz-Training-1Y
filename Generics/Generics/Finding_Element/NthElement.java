package Generics.Finding_Element;

import java.util.LinkedList;
import java.util.Scanner;

public class NthElement {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        Scanner s=new Scanner(System.in);
        Integer a=0;
        System.out.println("Enter the elements");
        for(int i=0; i<5; i++){
            a=s.nextInt();
            l.add(a);
        }
        System.out.println("Enter the index: ");
        int b=s.nextInt();
        System.out.println(l.get(b));
    }
}
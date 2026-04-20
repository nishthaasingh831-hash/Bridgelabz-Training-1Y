package Generics.Generic_Pair;

public class Runner {
    public static void main(String[] args) {
        Pair<String,Integer> p=new Pair<>("Amol",20);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
    }
}
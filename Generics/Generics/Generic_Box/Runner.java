package Generics.Generic_Box;

public class Runner {
    public static void main(String[] args) {
        Box<Integer> b=new Box();
        b.setValue(83);
        System.out.println("Integer: "+b.getValue());
        Box<String> s=new Box();
        s.setValue("Hello");
        System.out.println("String: "+s.getValue());
        Box<Double> d=new Box();
        d.setValue(82.32);
        System.out.println("Double: "+d.getValue());
    }
}
package Generics.Class_Practice;

public class Runner {
    public static void main(String[] args) {
        Box2 b=new Box2();
        b.setValue(9);
        System.out.println(b.getValue());
        b.setValue("ydh83");
        System.out.println(b.getValue());

        Box2<String> b1=new Box2();
        b1.setValue("ydh83");
        System.out.println(b.getValue());

        Box3<String,Integer> b3=new Box3<>("Lan",2);
        b3.setValue(3);
        System.out.println(b3.getValue());

    }
}
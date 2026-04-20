package Generics.Class_Practice;

public class Box2 <A> {
    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
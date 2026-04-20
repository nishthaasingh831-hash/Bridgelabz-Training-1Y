package Generics.Generic_Box;

public class Box <A>{
    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
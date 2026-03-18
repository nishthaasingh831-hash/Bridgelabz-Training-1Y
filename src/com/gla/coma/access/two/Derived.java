package com.gla.coma.access.two;
import com.gla.coma.access.one.Base;
public class Derived extends Base{
    public void testAccess(){
        publicMethod();
        protectedMethod();
    }
}

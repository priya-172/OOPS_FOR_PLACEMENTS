package Polymorphism.Overriding;

import java.io.EOFException;
import java.io.IOException;

class parent{
    public void methodOne() throws IOException{}
}
class Child extends parent{
 public void methodOne()throws EOFException,ArithmeticException {}
}

public class ExceptionHandlingCase {
    
}

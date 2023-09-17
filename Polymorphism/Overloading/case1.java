// Automatic promotion in overloading
package Polymorphism.Overloading;

public class case1 {
    public void methodOne(int i)
    {
    System.out.println("int-arg method");
    }
    public void methodOne(float f) //overloaded methods
    {
    System.out.println("float-arg method");
    }
    public static void main(String[] args)
    {
    case1 t=new case1();
    t.methodOne('a');//int-arg method
    t.methodOne(10l);//float-arg method
    //t.methodOne(10.5);//C.E:cannot find symbol
    }   
}

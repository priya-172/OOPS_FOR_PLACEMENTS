// In overloading method resolution is always based on reference type and runtime object 
// won't play any role in overloading
package Polymorphism;
class Animal{

}
class Monkey extends Animal{

}
public class Case6 {
    public void MethodName(Animal a){
        System.out.println("instance of animal class");
    }
    public void MethodName(Monkey m){
        System.out.println("instance of monkey class");
    }
    public static void main(String[] args) {
        Case6 c=new Case6();
        Animal a=new Animal();
        Monkey m = new Monkey();
        Animal am=new Monkey();
        c.MethodName(a);
        c.MethodName(m);
        c.MethodName(am);
    }
}

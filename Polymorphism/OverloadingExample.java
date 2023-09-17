package Polymorphism;

public class OverloadingExample {
    public void methodOne(){
        System.out.println("calling methodone");
    }
    public void methodOne(int i){
        System.out.println("overloaded method");
    }
    public static void main(String[] args) {
        OverloadingExample temp=new OverloadingExample();
        temp.methodOne(2);
        temp.methodOne();
    }
}

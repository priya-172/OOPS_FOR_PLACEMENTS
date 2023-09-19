
class OverloadedCon  { 
OverloadedCon (double d){ 
 System.out.println("double-argument constructor"); 
} 
OverloadedCon (int i) { 
this(10.5); 
System.out.println("int-argument constructor"); 
} 
OverloadedCon () { 
this(10);
 System.out.println("no-argument constructor"); 
} 
public static void main(String[] args) { 
OverloadedCon t1=new OverloadedCon (); //no-argument constructor/int-argument 
 //constructor/double-argument constructor 
OverloadedCon  t2=new OverloadedCon (10);
 //int-argument constructor/double-argument constructor 
OverloadedCon  t3=new OverloadedCon (10.5);//double-argument constructor 
 } 
}
 Binding of data and corresponding methods into a single unit is called 
Encapsulation .
 If any java class follows data hiding and abstraction such type of class is said to 
be encapsulated class.
Encapsulation=Datahiding+Abstraction
Access Modifiers:

Java provides four types of access modifiers: public, private, protected, and the default (package-private) modifier.
These modifiers control the visibility and accessibility of class members (variables and methods).
Getter and Setter Methods:

To access or modify the encapsulated data (private instance variables), you create public methods called "getters" and "setters."
Getters allow you to retrieve the values of private variables, and setters allow you to set new values, usually with some validation or logic.

Consider a real-life example of encapsulation: a bank account. A bank account encapsulates the account holder's information (e.g., name and account number) and balance. 
Access to this information and the ability to deposit or withdraw money is controlled through methods provided by the bank. 
The account holder cannot directly access or modify the balance or account number; they must use the methods provided by the bank. 
This encapsulation provides security and controlled access to the account's data.

In this example:

The bank account is like a Java class, encapsulating the account data (name, account number, balance).
The getter and setter methods provided by the bank represent encapsulation. They allow controlled access to the account's data, ensuring that it is accessed and modified securely and according to the bank's rules.
Encapsulation in the context of a bank account ensures that sensitive financial data is protected and accessed only through well-defined methods, which is a crucial concept in both Java and real-world applications. write  simple java code
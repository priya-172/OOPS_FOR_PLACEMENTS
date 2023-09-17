package Encapsulation;

class Student {
    private String name; // Private instance variable
    private int age;     // Private instance variable

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Validation
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }
}

public class StudentExample {
    
}

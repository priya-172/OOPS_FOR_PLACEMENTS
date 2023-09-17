package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    void move() {
        System.out.println("Animal is moving.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

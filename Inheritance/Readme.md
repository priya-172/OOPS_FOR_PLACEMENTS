**Inheritance** is one of the four fundamental principles of object-oriented programming (OOP), which includes encapsulation, abstraction, polymorphism, and inheritance. Inheritance allows a class (called the subclass or derived class) to inherit properties and behaviors (attributes and methods) from another class (called the superclass or base class). This concept models the "is-a" relationship, where a subclass is a specialized version of the superclass.

In Java, inheritance is implemented using the `extends` keyword. Here are the types of inheritance in Java:

1. **Single Inheritance**:
   - In single inheritance, a subclass inherits from a single superclass.
   - Java supports single inheritance, meaning a class can have only one direct superclass.

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
```

In this example, `Car` is a subclass that inherits from the `Vehicle` superclass. It inherits the `start` method from `Vehicle` and adds its own `accelerate` method.

2. **Multiple Inheritance (through Interfaces)**:
   - Java supports multiple inheritance through interfaces.
   - A class can implement multiple interfaces to inherit behaviors from multiple sources.

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}
```

In this example, the `Bird` class implements both the `Flyable` and `Swimmable` interfaces, inheriting the `fly` and `swim` methods from both interfaces.

**Real-Life Example**:

Consider a real-life example of inheritance involving animals:

- **Superclass**: `Animal` class, representing common properties and behaviors of all animals, such as `eat`, `sleep`, and `move`.
- **Subclasses**: `Dog` and `Bird` classes, representing specific types of animals.
- `Dog` and `Bird` inherit the common behaviors (methods) like `eat` and `sleep` from the `Animal` superclass and add their own specialized behaviors (`bark` for `Dog` and `fly` for `Bird`).

```java
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
```

In this example, `Dog` and `Bird` are subclasses that inherit common behaviors (methods) from the `Animal` superclass, demonstrating the "is-a" relationship. They also have their own specialized behaviors. This illustrates how inheritance models real-world hierarchies and relationships among objects in Java and OOP.
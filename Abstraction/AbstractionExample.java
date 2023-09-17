package Abstraction;

// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate the area (to be implemented by subclasses)
    abstract double calculateArea();
    
    // Concrete method (common behavior for all shapes)
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass representing a Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to calculate the area of a circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method to calculate the area of a rectangle
    @Override
    double calculateArea() {
        return width * height;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling abstract methods to calculate areas
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        // Displaying information
        circle.displayInfo();
        System.out.println("Area of the circle: " + circleArea);

        rectangle.displayInfo();
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}

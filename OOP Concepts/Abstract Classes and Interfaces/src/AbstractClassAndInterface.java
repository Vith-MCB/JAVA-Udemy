// Abstract Class
abstract class Shape {
    // Abstract Method
    public abstract double calculateArea();

    // Regular (non-abstract) Method
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Interface
interface Drawable {
    void draw();
}

// Class implementing the Shape abstract class and the Drawable interface
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a circle.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClassAndInterface {
    public static void main(String[] args) {
        // Creating a Circle object
        Circle circle = new Circle(5.0);

        // Using the Circle object
        System.out.println("Area of the Circle: " + circle.calculateArea());
        circle.displayInfo();
        circle.draw();
    }
}
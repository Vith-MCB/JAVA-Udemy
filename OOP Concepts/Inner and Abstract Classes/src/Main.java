// Abstract Class
abstract class Shape {
    // Abstract Method
    public abstract double calculateArea();

    // Regular (non-abstract) Method
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Inner Class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Inner Class within Circle
    class Position {
        private int x;
        private int y;

        // Constructor for Position
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Display the position
        public void displayPosition() {
            System.out.println("Position: (" + x + ", " + y + ")");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the Circle class
        Circle circle = new Circle(5.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());

        // Using the Position inner class
        Circle.Position position = circle.new Position(2, 3);
        position.displayPosition();

        // Using the abstract class
        Shape shape = new Circle(4.0);
        System.out.println("Area of the Shape: " + shape.calculateArea());
        shape.displayInfo();
    }
}
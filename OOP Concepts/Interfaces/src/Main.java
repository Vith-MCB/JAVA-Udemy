// Interface
interface Drawable {
    void draw(); // Abstract method (method without a body)
}

// Class implementing the Drawable interface
class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Another class implementing the Drawable interface
class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        // Creating objects of classes implementing the Drawable interface
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(4, 3);

        // Calling the draw method on each object
        circle.draw();
        rectangle.draw();
    }
}
// Generic class
/*
We define a generic class Box<T>, where T is a type parameter representing the type of content the box can hold.
This allows us to create a box for any data type.
 */
class Box<T> {
    private T content;

    // Constructor to initialize the box
    public Box(T content) {
        this.content = content;
    }

    // Method to get the content of the box
    public T getContent() {
        return content;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Create a box for an Integer
        Box<Integer> intBox = new Box<>(42);

        // Create a box for a String
        Box<String> strBox = new Box<>("Hello, Generics!");

        // Get and display the content of the boxes
        Integer intValue = intBox.getContent();
        String strValue = strBox.getContent();

        System.out.println("Integer Box Content: " + intValue);
        System.out.println("String Box Content: " + strValue);
    }
}

/* Another example: */
